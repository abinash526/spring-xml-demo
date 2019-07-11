package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {


    Actor actor;
    private ApplicationContext applicationContext;
    public Movie(){}

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void act()
    {
        actor.act();
    }

    public Movie setActor(Actor actor) {
        this.actor = actor;
        return this;
    }
    public void setBeanName(String beanName) {
        System.out.println("Name of the bean is:-"+beanName);}

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Name of the bean factory is:-"+beanFactory);

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        System.out.println("Container Detail is :-"+applicationContext);

    }
}
