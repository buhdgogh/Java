package com.homework_;

import com.abstract_.template_.B;

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}

class A {
    private final String NAME = "zhangsan";
    public void show() {
        class B {
            private final String NAME = "lisi";

            public void show() {
                System.out.println("B.NAME=" + NAME);
                System.out.println("A.NAME=" + A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}