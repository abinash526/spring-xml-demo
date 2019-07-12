package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("-------bean is Undergoing Initilization-------");

    }
    public void customInit()
    {
        System.out.println("------Initialized inside custom init--------");
    }
    public void customDestroy()
    {
        System.out.println("Destroyed inside custom----");
    }

    public void destroy() throws Exception {
        System.out.println("====Undergoing destruction=====");

    }
}
