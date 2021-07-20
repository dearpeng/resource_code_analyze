package com.luban.springsourcecodeanalysis.service.impl;

import com.luban.springsourcecodeanalysis.service.IDubboSpiTestService;
import com.luban.springsourcecodeanalysis.service.IJavaSpiTestService;

/**
 * Created by PengWX on 2021/5/28.
 */
public class DubboSpiTestServiceImpl implements IDubboSpiTestService {


    @Override
    public void test() {
        System.out.println("开始运行,DubboSpiTestServiceImpl运行了");
    }
}
