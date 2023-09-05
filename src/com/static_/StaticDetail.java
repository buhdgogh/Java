package com.static_;

//静态变量的细节
public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(B.n2);
        System.out.println(b.n1);
        //静态变量是类加载的时候就创建了，所以可以通过 类名.类变量 来访问
        System.out.println(Address.name);
    }
}

class B {
    public int n1 = 100;
    public static int n2 = 200;
}

class Address {
    public static String name = "小天";
}