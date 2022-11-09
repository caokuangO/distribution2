package com.git.boot.importbean.bean;

import org.springframework.stereotype.Component;

@Component
public class NormalBean {
    public NormalBean() {
        System.out.println("normal bean");
    }
}
