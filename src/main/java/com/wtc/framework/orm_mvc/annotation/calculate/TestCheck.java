package com.wtc.framework.orm_mvc.annotation.calculate;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 吴天成
 * @create 2019/4/15
 * @since 1.0.0
 */
@Slf4j
public class TestCheck {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.wtc.elasticsearch.annotation.calculate.Calculator");
            Object instance = clazz.newInstance();
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Check.class)) {
                    try {
                        method.invoke(instance);
                    } catch (InvocationTargetException e) {
                        log.error("异常名称：{}", e.getCause().getClass().getSimpleName());
                        log.error("异常原因：{}", e.getCause().getMessage());
                    }
                }

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}