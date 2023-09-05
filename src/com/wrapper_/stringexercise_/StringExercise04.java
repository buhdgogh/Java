package com.wrapper_.stringexercise_;

import com.sun.javaws.IconUtil;

public class StringExercise04 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";
        //执行过程：
        //1.创建一个StringBuilder对象 String sb = new StringBuilder();
        //2.执行sb.append("hello");
        //3.执行sb.append("abc");
        //4.String c = sb.toString();
        // 最后就是String对象c指向(String) value[]数组
        // 这个数组又指向常量池中的"helloabc"
        String c = a + b;
        String d = "helloabc";
        //因为d是直接指向常量池的字符串常量的地址
        //c是一个对象 它指向堆上的一块value数组空间 该数组又指向常量池的字符串常量
        System.out.println(c == d);
        //区分两个字符串常量相加和两个字符串变量相加
        String e = "hello" + "abc"; //指向常量池
        System.out.println(d == e);
    }
}


