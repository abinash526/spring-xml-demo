package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("BeforeInitialization in BeanPostProcessor class: " + beanName);
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("AfterInitialization in BeanPostProcessror class: " + beanName);
        return bean;
    }

}
