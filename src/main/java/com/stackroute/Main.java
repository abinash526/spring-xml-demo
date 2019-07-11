package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello");
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("wanted",Movie.class);
        movie.act();

        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie2=beanFactory.getBean("wanted",Movie.class);
        movie2.act();


        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        xmlBeanDefinitionReader.loadBeanDefinitions(new FileSystemResource("/home/abinash/MavinApp/SpringExercise2/src/main/resources/beans.xml"));
        Movie movie3= ((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("wanted",Movie.class);
        movie3.act();

        Movie movie4=context.getBean("KabirSingh",Movie.class);
        movie4.act();

        if(context.getBean("UdtaPunjab",Movie.class)==context.getBean("KabirSingh",Movie.class))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("not equal");
        }





    }
}
