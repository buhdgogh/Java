package com.main_;

//main方法的解释
public class Main01 {
    //静态变量/属性
    private static int n1 = 1;
    //非静态方法
    private int n2 = 2;
    //静态方法
    public static void hi() {
        System.out.println("hi~");
    }
    //非静态方法
    public void cry() {
        System.out.println("main01的cry()方法");
    }

    public static void main(String[] args) {
        //1.静态方法可以访问该类的静态成员
        System.out.println(n1);
        hi();

        //2.静态方法不可访问该类的非静态成员
        //3.想要访问该类的非静态成员 需要实例化对象
        Main01 main01 = new Main01();
        System.out.println(main01.n2);
        main01.cry();
    }
}
