package com.wtc.framework.orm_mvc.annotation.sql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 吴天成
 * @create 2019/4/15
 * @since 1.0.0
 */
@MyTable("User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @MyColumn("id")
    private String id;

    @MyColumn("name")
    private String name;

    @MyColumn("tel")
    private String tel;

}