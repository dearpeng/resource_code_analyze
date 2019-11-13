package com.luban.springsourcecodeanalysis.example;

import com.luban.springsourcecodeanalysis.config.AppConfig;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by PengWX on 2019/10/23.
 */
public class Example implements BeanPostProcessor {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Example1 example1 = (Example1) annotationConfigApplicationContext.getBean(Example1.class);
        System.out.println("=====================");
        System.out.println(example1.getClazName());
        System.out.println("=====================");
       /* GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClassName("");*/
    }
}
