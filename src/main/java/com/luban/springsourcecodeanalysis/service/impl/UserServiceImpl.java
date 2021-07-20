package com.luban.springsourcecodeanalysis.service.impl;

import com.luban.springsourcecodeanalysis.aspects.AopAnnotation;
import com.luban.springsourcecodeanalysis.service.IUserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by PengWX on 2019/10/23.
 */
@Data
@Service("userService")
public class UserServiceImpl implements IUserService {

    private String clazName;

    @Autowired
    private IndexServiceImpl indexService;

    static {
        System.out.println("Example1静态代码块");
    }

    public UserServiceImpl(){
        System.out.println("Example1构造方法");
    }

    @AopAnnotation
    public void testAspect(String message) throws Exception{
//        System.out.println("被代理方法开始执行的第一句代码");
//        int a = 100/0;
        System.out.println(this.getClass().getSimpleName()+"正在执行方法:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"参数是:"+message);
    }

    @Override
    public void testAop(String message){
        System.out.println(this.getClass().getSimpleName()+"正在执行aop方法:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"+++"+message);
    }


    @PostConstruct
    public void testPostConstruct(){
        System.out.println("@PostConstruct执行");
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
