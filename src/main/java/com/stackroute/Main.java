package com.stackroute;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    @Deprecated
    public static void main(String[] args) {

        //checking autowire byname
        ApplicationContext context = new ClassPathXmlApplicationContext("actorbean.xml");
        Movie movie = (Movie) context.getBean("movie1");
        System.out.println(movie);

        //contructor based injection rather than autowirebyType
        ApplicationContext context1 = new ClassPathXmlApplicationContext("actorbean.xml");
        Movie movie1= (Movie) context.getBean("movie2");
        System.out.println(movie1);

    }
}

