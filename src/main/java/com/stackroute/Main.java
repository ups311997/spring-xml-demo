package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JavaBean.xml");
//        Movie movie=(Movie)applicationContext.getBean("movie1");
//
//        System.out.println(movie.getActor());



//       XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("JavaBean.xml"));
//
//        Movie movieFirst= (Movie)xmlBeanFactory.getBean("movie2");
//
//        System.out.println(movieFirst.getActor());
//
//        movie.setApplicationContext(applicationContext);
//        movieFirst.setBeanFactory(xmlBeanFactory);
//
        AbstractApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("JavaBean.xml");
        applicationContext1.registerShutdownHook();
        BeanLifecycleDemoBean bean = (BeanLifecycleDemoBean)applicationContext1.getBean("beanlifecycledemo");
        System.out.println(bean.getMessage());
    }
}
