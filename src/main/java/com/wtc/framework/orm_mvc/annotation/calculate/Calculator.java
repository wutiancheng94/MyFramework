package com.wtc.framework.orm_mvc.annotation.calculate;

/**
 * 检查计算方法是否有异常
 *
 * @author 吴天成
 * @create 2019/4/15
 * @since 1.0.0
 */
public class Calculator {

    @Check
    public void add() {
        System.out.println("1 + 0 =" + (1 + 0));
    }

    @Check
    public void sub() {
        System.out.println("1 - 0 =" + (1 - 0));
    }

    @Check
    public void mul() {
        System.out.println("1 * 0 =" + (1 * 0));
    }

    @Check
    public void div() {
        System.out.println("1 / 0 =" + (1 / 0));
    }

    public void show() {
        System.out.println("用于Bug.....");
    }
}