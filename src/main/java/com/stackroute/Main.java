package com.stackroute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    @Deprecated
    public static void main(String[] args)
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("actorbean.xml");
        Movie movie= (Movie)context.getBean("movie1");
        System.out.println( movie);

        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("actorbean.xml"));
        Movie  movie1=(Movie)factory.getBean("movie2");
        System.out.println(movie1);

        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("actorbean.xml"));
        Movie movie4=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie3");
        System.out.println(movie4);
    }
}

