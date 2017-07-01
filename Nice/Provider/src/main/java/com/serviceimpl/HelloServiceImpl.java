package com.serviceimpl;


import com.service.HelloService;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("这里是provider");
        System.out.println("say Hello");
    }
}
