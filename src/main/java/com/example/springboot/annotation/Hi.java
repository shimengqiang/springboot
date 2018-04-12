package com.example.springboot.annotation;


import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Hi {

    String value1() default "default value1";

    String value2();
}
