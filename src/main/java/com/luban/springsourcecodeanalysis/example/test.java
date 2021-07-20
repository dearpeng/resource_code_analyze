package com.luban.springsourcecodeanalysis.example;

import com.luban.springsourcecodeanalysis.service.IUserService;
import sun.misc.ProxyGenerator;

import javax.security.auth.Subject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by PengWX on 2021/4/6.
 */
public class test {

    public static void main(String[] args) {
        //查看代理后的字节码是什么样的
        String name = "ProxySubject";
        byte[] data = ProxyGenerator.generateProxyClass(name,new Class[]{IUserService.class});
        FileOutputStream out =null;
        try {
            out = new FileOutputStream(name+".class");
            System.out.println("地址是哪里:"+(new File("hello")).getAbsolutePath());
            out.write(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=out) try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





        //查看vm里面设置的内存信息
        /*System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
        System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
        System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
        byte[] bytes = new byte[8*1024*1024];
        System.out.println("请求8兆后max memory:"+Runtime.getRuntime().maxMemory());
        System.out.println("请求8兆后free memory:"+Runtime.getRuntime().freeMemory());
        System.out.println("请求8兆后total memory:"+Runtime.getRuntime().totalMemory());*/


    }
}
