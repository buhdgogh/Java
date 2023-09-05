package com.bignum_;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        double d = 24.9999999999999999999999999999999d;
        System.out.println(d);
        // 1.BigDecimal类：
        // 当我们要保存精度很高的数的时候，double就不够使用
        // 这时我们就可以用BigDecimal类来实现高精度
        BigDecimal bigDecimal = new BigDecimal("24.99999999999999999999999999999999999");
        System.out.println(bigDecimal);
        // 2.对于BigDecimal类，我们不能直接进行加减乘除运算
        // 我们需要创建一个BigDecimal类，然后调用方法进行加减乘除
        BigDecimal bigDecimal1 = new BigDecimal("1.025451");
        System.out.println(bigDecimal.add(bigDecimal1)); //加
        System.out.println(bigDecimal.subtract(bigDecimal1)); //减
        System.out.println(bigDecimal.multiply(bigDecimal1)); //乘
        // 这里可能会抛出一个异常，因为可能出现除不尽的情况，也就是无限(不)循环数
        // ArithmeticException
        //System.out.println(bigDecimal.divide(bigDecimal1)); //除
        // 解决方法：
        // 在调用divide方法的时候指定精度即可
        // BigDecimal.ROUND_CEILING 指定保留的小数点位数和分子相同
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING)); //除
    }
}
