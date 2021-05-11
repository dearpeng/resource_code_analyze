package com.luban.springsourcecodeanalysis.example;

import com.luban.springsourcecodeanalysis.config.AppConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.CountDownLatch;

/**
 * Created by PengWX on 2019/10/23.
 */
//@ComponentScan("com.luban")
public class Example implements BeanPostProcessor {
    @Value("${spring.source.test.code}")
    private static String testCode;

    public static void main(String[] args) {
        /*MyThread thread = new MyThread();
        thread.start();

        System.out.println("daduan");
        thread.interrupt();
        System.out.println("第一次调用thread.isInterrupted()：" + thread.isInterrupted() +"-------"+ thread.getName());
        System.out.println("第二次调用thread.isInterrupted()：" + thread.isInterrupted() +"-------"+ thread.getName());
        测试interrupted（）函数
        System.out.println("第二次调用thread.interrupted()：" + thread.isInterrupted()+"-------" + thread.getName());
        System.out.println("第一次调用thread.interrupted()：" + thread.interrupted()+"-------" + thread.getName());
        System.out.println("第二次调用thread.interrupted()：" + thread.isInterrupted()+"-------" + thread.getName());
        System.out.println("thread是否存活：" + thread.isAlive());*/


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
       /* CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    //准备完毕……运动员都阻塞在这，等待号令
                    countDownLatch.await();
                    String parter = "【" + Thread.currentThread().getName() + "】";
                    System.out.println(parter + "开始执行……");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        try {
            Thread.sleep(2000);// 裁判准备发令
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();// 发令枪：执行发令*/
    }

}
