package com.demo.demo;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
 
    @ResponseBody
    @PostMapping(value = "/hello", consumes = "application/json", produces = "application/json")
    public Map<String, Object> Hello(@RequestBody String jsonString) throws ParseException {
        
            // JSON 문자열을 파싱하여 JSONObject로 변환
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(jsonString);

            // Service로 JSONObject 전달하고 결과 받기
            Map<String, Object> resultMap = helloService.jData(jsonObject);

            return resultMap;
    }
}
