package com.wtc.framework.orm_mvc.annotation.sql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: 吴天成
 * @Date: 2019/4/15
 * @Description: com.wtc.elasticsearch.annotation.sql
 * @version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyTable {

    String value();
}
