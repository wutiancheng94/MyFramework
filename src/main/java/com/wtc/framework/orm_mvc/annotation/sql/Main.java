package com.wtc.framework.orm_mvc.annotation.sql;

import java.lang.reflect.Field;

/**
 * @author 吴天成
 * @create 2019/4/15
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) throws Exception {
        User user = new User("1", "呵呵", "120");
        quert(user);
    }

    private static void quert(Object object) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder("select * form ");
        Class<?> clazz = object.getClass();

        if(clazz.isAnnotationPresent(MyTable.class)) {
            MyTable myTable = clazz.getAnnotation(MyTable.class);
            sb.append(myTable.value()).append(" where ");

            Field[] fields = clazz.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                if (fields[i].isAnnotationPresent(MyColumn.class)) {
                    fields[i].setAccessible(true);
                    MyColumn column = fields[i].getAnnotation(MyColumn.class);
                    String value = column.value();
                    sb.append(value).append("=").append(fields[i].get(object));
                    if (i != fields.length - 1) {
                        sb.append(" and ");
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }
}