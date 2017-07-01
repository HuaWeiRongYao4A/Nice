package com.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.HelloService;


/**
 * Created by Administrator on 2017/6/18.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/sayHello")
    public String sayHello() {
        logger.info("666");
        System.out.println("666");
        helloService.sayHello();
        return "success";
    }

}
