package com.luban.springsourcecodeanalysis.example;

import com.luban.springsourcecodeanalysis.config.AppConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by PengWX on 2019/10/23.
 */
//@ComponentScan("com.luban")
public class Example implements BeanPostProcessor {
    @Value("${spring.source.test.code}")
    private static String testCode;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext(AppConfig.class);
        aac.scan("com.luban");
        aac.register(UserServiceImpl.class);
        UserServiceImpl userServiceImpl = (UserServiceImpl) aac.getBean(UserServiceImpl.class);
        System.out.println("=====================");
        System.out.println(userServiceImpl.getClazName());
        System.out.println(testCode);
        System.out.println("=====================");
       /* GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClassName("");*/
    }
}
