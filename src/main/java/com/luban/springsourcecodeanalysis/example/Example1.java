package com.luban.springsourcecodeanalysis.example;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by PengWX on 2019/10/23.
 */
@Data
@Component
public class Example1 {

    private String clazName;

    static {
        System.out.println("Example1静态代码块");
    }

    public Example1(){
        System.out.println("Example1构造方法");
    }

/*
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean初始化前开始干活");
        if  (beanName.contains("Example")){
            clazName = "postProcessBeforeInitialization222222222222222222222222222222";
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean初始化后开始==================");
        System.out.println(clazName);
        return bean;
    }*/
}
