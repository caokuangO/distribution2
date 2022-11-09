package com.git.boot.importbean.bean;

import org.springframework.stereotype.Component;

@Component
public class ABean {
    public ABean(DemoBean1 demoBean1) {
        System.out.println("a bean : " + demoBean1);
    }
}
