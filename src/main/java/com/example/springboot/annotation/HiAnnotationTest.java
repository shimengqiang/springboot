package com.example.springboot.annotation;

public class HiAnnotationTest {


    @Hi(value2 = "2")
    public void sayHI(){

        System.out.println("init");
    }

}
