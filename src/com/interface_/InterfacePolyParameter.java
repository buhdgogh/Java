package com.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        //接口多态的体现：
        //接口可以指向实现该接口的类
        IF iff = new Monster();
        iff = new Mouse();

        //继承多态的体现：
        //父类可以执行继承该类的子类
        AAA aaa = new BBB();
        aaa = new CCC();
    }
}

class Monster implements IF {}

class Mouse implements IF {}

interface IF {}

class AAA {}

class BBB extends AAA {}

class CCC extends BBB {}