package com.luban.springsourcecodeanalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringSourceCodeAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSourceCodeAnalysisApplication.class, args);
    }

}
