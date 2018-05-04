package com.liuhao.zookeeper.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.liuhao.zookeeper.parent.service.IHelloService;


@org.springframework.stereotype.Service
@Service(interfaceClass = IHelloService.class)
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
