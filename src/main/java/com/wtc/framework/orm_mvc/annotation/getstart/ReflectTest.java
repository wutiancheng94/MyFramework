package com.wtc.framework.orm_mvc.annotation.getstart;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 吴天成
 * @create 2019/4/15
 * @since 1.0.0
 */
@Pro(className = "com.wtc.elasticsearch.annotation.getstart.Demo01", menthodName = "show")
public class ReflectTest {

    public static void main(String[] args) {
        //  获取带注解的字节码文件
        Class<ReflectTest> reflectTestClass = ReflectTest.class;

        //  获取其注解对象
        Pro annotation = reflectTestClass.getAnnotation(Pro.class);
        /**
         * 相对于
         * public class ProImpl implements Pro {
         *     Public String className() {
         *         return "com.wtc.elasticsearch.annotation.getstart.Demo01";
         *     }
         *
         *     Public String methodName() {
         *         return "show";
         *     }
         * }
         * 入门
         *
         */

        String className = annotation.className();
        String menthodName = annotation.menthodName();

        try {
            Class<?> clazz = Class.forName(className);
            Object instance = clazz.newInstance();
            Method method = clazz.getMethod(menthodName);
            method.invoke(instance);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}