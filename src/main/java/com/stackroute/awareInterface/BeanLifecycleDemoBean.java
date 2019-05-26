package com.stackroute.awareInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {



    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println(" after property set:" );

    }

    public void customInit() throws Exception {
        System.out.println("cutomInit method after properties are set : " );
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("destroyed");

    }

    public void customDestroy() throws Exception
    {
        System.out.println("after cutomDestroy");
    }


}