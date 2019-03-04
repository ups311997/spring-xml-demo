package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BeanLifecycleDemoBean{" +
                "message='" + message + '\'' +
                '}';
    }



    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean init method called");

    }
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy method called");
    }
    public void customInit()
    {
        System.out.println("customInit method called");
    }
    public void customDestroy()
    {
        System.out.println("customDestroy method called");
    }
}
