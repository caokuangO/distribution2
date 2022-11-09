package com.git.boot.importbean.bean;

import com.git.boot.importbean.anno.Meta;

@Meta
public class DependBean {
    public DependBean(NormalBean normalBean) {
        System.out.println("depend bean! " + normalBean);
    }
}
