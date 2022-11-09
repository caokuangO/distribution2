package com.git.boot.importbean.bean;

import com.git.boot.importbean.anno.Meta;
import org.springframework.beans.factory.annotation.Autowired;

@Meta
public class DependBean2 {
    @Autowired
    public DependBean2(DemoBean1 demoBean1) {
        System.out.println("depend bean2! " + demoBean1);
    }
}
