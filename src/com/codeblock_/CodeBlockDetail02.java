package com.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {

        //创建一个对象的时候,一个类中的调用顺序是：
        // 1.先执行 静态代码块 和 静态属性初始化
        // 他俩的优先级是一样的，至于先执行哪一个就看哪个定义再前面
        // 2.再执行 非静态代码块 和 普通属性初始化
        // 他俩的优先级是一样的，至于先执行哪一个就看哪个定义再前面
        // 3.调用构造方法

        A a = new A();
        System.out.println(A.n1);
    }
}

class A {
    public static int n1 = getN1();

    public int n2 = getN2();

    static {
        System.out.println("静态代码块被调用");
    }

    {
        System.out.println("非静态代码块被调用");
    }

    public static int getN1() {
        System.out.println("getN1()方法被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2()方法被调用");
        return 200;
    }

    public A() {
        System.out.println("A 构造器被调用");
    }
}
