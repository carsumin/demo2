package com.demo.demo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    
    public Map<String, Object> jData(JSONObject inputData){
        
        //결과 담을 HashMap 생성
        Map<String, Object> resultMap = new HashMap<>();

        //받아온 inputData 반복문 돌면서 key, value 처리
        for(Object key : inputData.keySet()){ //KeySet() 메서드로 key 얻어옴
            String keyStr = (String) key;
            Object value = inputData.get(keyStr);

            resultMap.put(keyStr, value);
            System.out.println("---");
            System.out.println(resultMap);
        }

        return resultMap;
    }
}
