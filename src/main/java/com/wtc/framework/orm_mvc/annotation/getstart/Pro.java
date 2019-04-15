package com.wtc.framework.orm_mvc.annotation.getstart;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 〈描述需要执行的类名和方法名〉
 *
 * @author 吴天成
 * @create 2019/4/15
 * @since 1.0.0
 */
@Target({ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Pro {

    String className();

    String menthodName();
}