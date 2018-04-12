package com.example.springboot.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HiAnnotationTest hiAnnotationTest = new HiAnnotationTest();
        //获取AnnotationTest2的Class实例
        Class<HiAnnotationTest> c = HiAnnotationTest.class;
        //获取需要处理的方法Method实例
        Method method = c.getMethod("sayHI", new Class[]{});
        //判断该方法是否包含MyAnnotation注解
        if(method.isAnnotationPresent(Hi.class)){
            //获取该方法的MyAnnotation注解实例
            Hi hi = method.getAnnotation(Hi.class);
            //执行该方法 初始化hiAnnotationTest
            method.invoke(hiAnnotationTest, new Object[]{});
            //获取myAnnotation
            String value1 = hi.value1();
            String value2 = hi.value2();
            System.out.println(value1+"<<<<"+value2);
        }
        //获取方法上的所有注解
        Annotation[] annotations = method.getAnnotations();
        for(Annotation annotation : annotations){
            System.out.println(">>>>"+annotation);
        }
    }
}
