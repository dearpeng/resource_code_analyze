package com.luban.springsourcecodeanalysis.example;

/**
 * Created by PengWX on 2021/4/6.
 */
public class test {

    public static void main(String[] args) {

        //查看vm里面设置的内存信息
        System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
        System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
        System.out.println("total memory:"+Runtime.getRuntime().totalMemory());

    }
}