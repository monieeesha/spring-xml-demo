package com.stackroute;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    @Deprecated
    public static void main(String[] args) {

        //using application context testing sinleton scope
        ApplicationContext context = new ClassPathXmlApplicationContext("actorbean.xml");
        Movie movie = (Movie) context.getBean("movie1");
        Movie movie1 = (Movie) context.getBean("movie1");
        System.out.println(movie);

        //using application context testing prototype scope
        ApplicationContext context1 = new ClassPathXmlApplicationContext("actorbean.xml");
        Movie movie2= (Movie) context.getBean("movie2");
        Movie movie3= (Movie) context.getBean("movie2");
        System.out.println(movie2);



        //bean scope(singleton)
        System.out.println(movie==movie1);

        //bean scope(prototype)
        System.out.println(movie2==movie3);


        //using name retreiving the bean
        ApplicationContext context2 = new ClassPathXmlApplicationContext("actorbean.xml");
        Movie movie4= (Movie) context.getBean("movieA");
        System.out.println(movie4);


        ApplicationContext context3 = new ClassPathXmlApplicationContext("actorbean.xml");
        Movie movie5 = (Movie) context.getBean("movieB");
        System.out.println(movie5);

    }
}

