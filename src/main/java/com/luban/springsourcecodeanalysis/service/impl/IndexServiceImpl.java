package com.luban.springsourcecodeanalysis.service.impl;

import com.luban.springsourcecodeanalysis.aspects.AopAnnotation;
import com.luban.springsourcecodeanalysis.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by PengWX on 2019/10/23.
 */
@Service(value = "indexService")
public class IndexServiceImpl implements IIndexService {

    @Autowired
    private UserServiceImpl userService;

    @AopAnnotation
    public void testAspect() {
        System.out.println("IndexServiceImpl开始被代理");
    }
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(    random.nextInt(2));
    }

}
