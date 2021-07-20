package com.luban.springsourcecodeanalysis.aspects;

import java.lang.annotation.*;

/**
 * Created by PengWX on 2021/6/24.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AopAnnotation {
}
