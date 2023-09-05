package com.innerclass_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 成员内部类
 */
public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        outer06.t();

        //外部其他类访问成员内部类的三种方式：

        //第一种方式：
        //理解：相当于把Inner06类看做Outer06的成员
        Outer06.Inner06 inner06 = outer06.new Inner06();
        inner06.say();

        //第二种方式：
        //在外部类中写一个方法，返回内部类的实例
        Outer06.Inner06 inner06Instance = outer06.getInner06Instance();
        inner06.say();

        //第三种方式：
        //外部类对象和内部类对象一起创建
        Outer06.Inner06 inner061 = new Outer06().new Inner06();

        //当外部类和成员内部类重名时，遵守就近原则访问
        //如果想要访问外部类的成员时可以用  外部类名.this.成员的方式访问
    }
}


class Outer06 {
    private int n = 100;
    private String name;

    //注意：成员内部类的定义位置在外部类的成员位置上
    //成员内部类(相当于外部类的一个成员)
    //成员内部类可以用访问修饰符修饰
    //成员内部类可以访问外部类的所有成员(包括私有的)
    //成员内部类相当于一个成员，可以直接用，也就是在方法中可以直接创建对象
    class Inner06 {
        private int m = 888;
        public void say() {
            System.out.println("我是Inner06里面的say方法");
            System.out.println("n=" + n + " name=" + name);
        }
    }

    public Inner06 getInner06Instance() {
        return new Inner06();
    }

    public void t() {
        //成员内部类相当于一个成员,想要使用,可以直接创建对象,然后使用各种属性和方法
        Inner06 inner06 = new Inner06();
        inner06.say();
        System.out.println(inner06.m);
    }
}