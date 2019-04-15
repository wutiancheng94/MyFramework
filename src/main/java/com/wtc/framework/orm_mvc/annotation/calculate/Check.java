package com.wtc.framework.orm_mvc.annotation.calculate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: 吴天成
 * @Date: 2019/4/15
 * @Description: com.wtc.elasticsearch.annotation.calculate
 * @version: 1.0
 */
@Target({ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Check {

}
