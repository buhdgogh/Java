package com.static_;

//静态变量的访问权限
public class VisitStatic {

    public static void main(String[] args) {
        //类名.类变量名
        //类变量是随着类加载而创建的 所以即使没有创建对象实例也可以访问
        System.out.println(A.name);
        //对象名.类变量名
        A a = new A();
        System.out.println(a.name);
    }
}

class A {
    public static String name = "小天";
}