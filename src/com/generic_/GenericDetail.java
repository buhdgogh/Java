package com.generic_;

public class GenericDetail {
    public static void main(String[] args) {
        System.out.println("zxt");
        A <String> a = new A("zxt");
        a.fun(12.3f,new B());
    }
}

class A <E> {
    E e;

    public A(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public <E, T> void fun(E e,T t) {
        System.out.println("e-type" + e.getClass() + " t-type" + t.getClass());
    }
}

class B {
    public B() {
        System.out.println("构造B类");
    }
}