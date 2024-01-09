const data = JSON.stringify(params);

$(document).ready(function(){
    $('#submit').click(function(){
        $.ajax({
            url : "/hello",
            type : "POST",
            contentType: "application/json",
            data : data,
            dataType : 'json',
            success : function(data){
                if(data){
                    //성공
                    console.log(data);
                }
            },
            error:function(request,status,error){        
                console.log("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);       
            }         
        })
    });
});
