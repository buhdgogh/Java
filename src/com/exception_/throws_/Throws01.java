package com.exception_.throws_;

import java.io.FileInputStream;

public class Throws01 {
    public static void main(String[] args) {

    }

    // 1.f2()方法中产生的异常可以用try-catch-finally来处理异常
    // 2.也可以直接抛给调用该方法的调用者去解决
    // 3.throws后面抛出的异常可以是方法中产生的异常 也可以是它的父类
    // throws后面的也可以是异常列表(即throws可以抛出多个异常)
    // throws FileNotFoundException,ArithmeticException,NULLPointerException
    public void f2() throws Exception {
        FileInputStream file = new FileInputStream("D://aa.txt");
    }
}
