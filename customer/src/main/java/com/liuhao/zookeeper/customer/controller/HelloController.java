package com.liuhao.zookeeper.customer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.liuhao.zookeeper.parent.service.IHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloController {

    @Reference(check = false)
    private IHelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.sayHello();
    }

}
