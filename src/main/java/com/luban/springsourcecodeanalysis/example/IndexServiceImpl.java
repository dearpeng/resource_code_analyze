package com.luban.springsourcecodeanalysis.example;

import com.luban.springsourcecodeanalysis.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by PengWX on 2019/10/23.
 */
@Service(value = "indexService")
public class IndexServiceImpl {

    @Autowired
    private UserServiceImpl userService;

}
