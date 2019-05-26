package com.stackroute.awareInterface;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    @Deprecated
    public static void main(String[] args) {


        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("actorbean.xml");
        Movie movie = (Movie) context.getBean("movie1");
        System.out.println(movie);
        Movie movie1=(Movie) context.getBean("movie2");
        System.out.println(movie1);
        context.close();



    }
}

