package com.luban.springsourcecodeanalysis.example;

import com.luban.springsourcecodeanalysis.aspects.InvocationHandlerImpl;
import com.luban.springsourcecodeanalysis.config.AppConfig;
import com.luban.springsourcecodeanalysis.service.IDubboSpiTestService;
import com.luban.springsourcecodeanalysis.service.IJavaSpiTestService;
import com.luban.springsourcecodeanalysis.service.IUserService;
import com.luban.springsourcecodeanalysis.service.impl.UserServiceImpl;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.security.auth.Subject;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ServiceLoader;

/**
 * Created by PengWX on 2019/10/23.
 */
//@ComponentScan("com.luban")
public class Example implements BeanPostProcessor {
    @Value("${spring.source.test.code}")
    private static String testCode;

    public static Date strToDate(String strDate, String strFormat)
            throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(strFormat);
        return format.parse(strDate);
    }

    public static void main(String[] args) {
        //代理的真实对象
        UserServiceImpl realSubject = new UserServiceImpl();

        /**
         * InvocationHandlerImpl 实现了 InvocationHandler 接口，并能实现方法调用从代理类到委托类的分派转发
         * 其内部通常包含指向委托类实例的引用，用于真正执行分派转发过来的方法调用.
         * 即：要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法
         */
        /*InvocationHandler handler = new InvocationHandlerImpl(realSubject);
        ClassLoader loader = realSubject.getClass().getClassLoader();
        Class[] interfaces = realSubject.getClass().getInterfaces();
        *//**
         * 该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
         *//*
        IUserService subject = (IUserService) Proxy.newProxyInstance(loader, interfaces, handler);
        System.out.println("动态代理对象的类型："+subject.getClass().getName());
        subject.testAop("123456798");
        System.out.println("1111111111111111111111111111111111");*/

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


        // 修改循环依赖
      /*  AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext();
        aac.setAllowCircularReferences(Boolean.FALSE);
        aac.register(AppConfig.class);
        aac.refresh();*/
        // 修改循环依赖结束

//        aac.scan("com.luban");
//        aac.register(UserServiceImpl.class);
       /*java spi

       ServiceLoader<IJavaSpiTestService> load = ServiceLoader.load(IJavaSpiTestService.class);
        for (IJavaSpiTestService service : load) {
            service.test();
        }*/
       // dubbo spi测试
        /*ExtensionLoader<IDubboSpiTestService> extensionLoader = ExtensionLoader.getExtensionLoader(IDubboSpiTestService.class);
        IDubboSpiTestService first = extensionLoader.getExtension("first");
        first.test();*/

       /* System.out.println(new BigDecimal("1000.504").setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal("1000.505").setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal("1000.506").setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println("===============================");
        System.out.println(new BigDecimal(1000.504).setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal(1000.505).setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal(1000.506).setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println("===============================");
        System.out.println(BigDecimal.valueOf(1000.504).setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println(BigDecimal.valueOf(1000.505).setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println(BigDecimal.valueOf(1000.506).setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println("===============================");
        System.out.println(new BigDecimal(1000.4).divide(new BigDecimal(10)).setScale(1,BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal(1000.5).divide(new BigDecimal(10)).setScale(1,BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal(1000.6).divide(new BigDecimal(10)).setScale(1,BigDecimal.ROUND_HALF_UP));*/


        AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext(AppConfig.class);
        UserServiceImpl userServiceImpl = (UserServiceImpl) aac.getBean(UserServiceImpl.class);

        System.out.println("=====================");
        try {
            userServiceImpl.testAspect("我是userService测试aop方法");
        } catch (Exception e) {
            e.printStackTrace();
        }
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
