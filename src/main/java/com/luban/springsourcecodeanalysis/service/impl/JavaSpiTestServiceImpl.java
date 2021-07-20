package com.luban.springsourcecodeanalysis.service.impl;

import com.luban.springsourcecodeanalysis.service.IJavaSpiTestService;

/**
 * Created by PengWX on 2021/5/28.
 */
public class JavaSpiTestServiceImpl implements IJavaSpiTestService {


    @Override
    public void test() {
        System.out.println("开始云心,java spi运行了");
    }
}
