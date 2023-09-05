package com.exception_.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    public static void main(String[] args) {
//        f2();
    }

    // 1.如果有编译异常，那么必须处理，可以用try-catch-finally 或者 throws
    // 2.对于运行时异常，如果没有处理，那么程序默认的是throws
    public static void f2() throws Exception /* throws ArithmeticException */{
        int n1 = 10;
        int n2 = 0;
        int result = n1 / n2;
        // 这里f3报错是因为这里没有显示的抛出异常
        // 那么这里的f3就会被当作编译异常处理
        // 所以要在f2中显示的处理异常 要么try-catch-finally 或者继续抛出
        f3();
    }

    public static void f3() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("D://aa.txt");
    }

    public static void f4() {
        // 这里之所以不会抛出异常是因为f5抛出的是运行异常
        // 而对于运行异常有默认的处理机制 即throws
        f5();
    }

    //RuntimeException
    public static void f5() throws ArithmeticException{

    }
}

// 1.子类继承父类，那么要求子类抛出的异常要么和父类抛出的异常一样
//   要么为父类抛出异常的子类
// 2.在throws过程中 如果有try-catch处理  那么就不继续throws
//   执行try-catch
class Father {
    public void f1() throws RuntimeException {}
}

class Son extends Father {
    @Override
    public void f1() throws NullPointerException {

    }
}
