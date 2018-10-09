package com.firestone.api;

import com.firestone.model.ServerResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huang
 * @Date: 2018/9/30 09:39
 * @Description:
 */
@RestController
public class SayHelloApi {

    @RequestMapping(value = "sayHello",method = RequestMethod.POST)
    public ServerResult<String> sayHello(String str){
        String resp = "This is industry service say:"+str;
        return ServerResult.success(resp);
    }
}