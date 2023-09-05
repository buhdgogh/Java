package com.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        new B().show();
    }
}

interface IT {
    int x = 1;  //相当于public static final int x = 1;
}

class A {
    int x = 2;
}

class B extends A implements IT{
    public void show() {
        //System.out.println(x); //错误 因为不明确x是谁
        //访问接口的 x 就用接口名.x
        //访问父类的 x 就用super.x
        System.out.println(IT.x + " " + super.x);
    }
}
