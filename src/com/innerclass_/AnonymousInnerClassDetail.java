package com.innerclass_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.f1();
    }
}

class Outer02 {
    private int n = 100;
    public void f1() {
        Person p = new Person(){
            @Override
            public void hi() {
                System.out.println("匿名对象重写了hi方法");
            }
        };
        p.hi(); //动态绑定,运行类型是 Outer02$1

        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名对象重写了hi方法...");
            }
        }.hi();

    }
}


class Person {
    public void hi() {

    }
}
