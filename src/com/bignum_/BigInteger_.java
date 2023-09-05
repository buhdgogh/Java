package com.bignum_;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        // 1.BigInteger类
        // 当我们处理数据的时候遇到很大的数，即使long也无法储存
        // 我们就可以用BigInteger类
        BigInteger bigInteger = new BigInteger("25449999999999999999999999999999");
        System.out.println(bigInteger);
        // 2.BigInteger的加减乘除
        // 对于BigInteger类的数据，我们不能直接加减乘除
        // 我们需要使用方法来进行加减乘除运算
        BigInteger bigInteger1 = new BigInteger("10");
        System.out.println(bigInteger.add(bigInteger1)); //加
        System.out.println(bigInteger.subtract(bigInteger1)); //减
        System.out.println(bigInteger.multiply(bigInteger1)); //乘
        System.out.println(bigInteger.divide(bigInteger1)); //除
    }
}
