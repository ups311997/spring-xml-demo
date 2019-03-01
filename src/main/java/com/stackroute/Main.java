package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JavaBean.xml");
        Movie movie=(Movie)applicationContext.getBean("movie1");
        Movie mov=(Movie)applicationContext.getBean("movie1");
        System.out.println(movie.getActor());
        System.out.println(movie==mov);


        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("JavaBean.xml");
        Movie movieFirst= (Movie)applicationContext1.getBean("movie2");
        Movie movieSecond= (Movie)applicationContext1.getBean("movie2");
        System.out.println(movieFirst.getActor());
        System.out.println(movieFirst==movieSecond);
    }
}
