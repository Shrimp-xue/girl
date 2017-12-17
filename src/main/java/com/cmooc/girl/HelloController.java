package com.cmooc.girl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Author:shrimp
 * @Description:
 * @Dete: 13:01 2017/12/17
 * @Modfided By:
 *
 */
@RestController
public class HelloController {

    /**
     *
     * @Author:shrimp
     * @Description:
     * @Dete: 13:03 2017/12/17
     * @Modfided By:
     *
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET )
    public String say(){
        return "Hello Spring Boot";
    }
}
