package com.wrapper_;

import java.net.Inet4Address;

public class WrapperExercise01 {
    public static void main(String[] args) {
        method01();
    }
    public static void method01() {
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        System.out.println(integer1 == integer2);

        // 自动装箱->Integer.valueOf(); 底层的源码的返回值取决于传入的数的大小
        // 如果传入的数在 -128~127 之间，那么就直接返回
        // 如果传入的数不在这个范围，那么就返回一个对象
        Integer integer3 = 1;
        Integer integer4 = 1;
        System.out.println(integer3 == integer4);

        Integer integer5 = 128;
        Integer integer6 = 128;
        System.out.println(integer5 == integer6);
    }
}
