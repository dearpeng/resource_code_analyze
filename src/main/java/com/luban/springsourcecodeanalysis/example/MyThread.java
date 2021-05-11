package com.luban.springsourcecodeanalysis.example;

/**
 * Created by PengWX on 2021/4/20.
 */
public class MyThread extends Thread {
    @Override
    public  void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("shuijiao");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i="+(i+1));
        }
    }

    public static void main(String[] args) {
        System.out.println("asldfjlsdf134646546asdf3".hashCode());
    }




}
