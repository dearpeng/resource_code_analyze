package com.luban.springsourcecodeanalysis.service;

import org.apache.dubbo.common.extension.SPI;

/**
 * Created by PengWX on 2021/5/28.
 */
@SPI
public interface IDubboSpiTestService {

    void test();
}
