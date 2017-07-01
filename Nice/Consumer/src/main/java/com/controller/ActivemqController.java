package com.controller;

import com.service.ActivemqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description : Active Controller
 * @createTime : 2017/06/20
 */
@RestController
@RequestMapping("active")
public class ActivemqController {

    @Autowired
    private ActivemqService activemqService;

    @RequestMapping("publish")
    public String publish() {
        activemqService.publish();
        return "success";
    }
}
