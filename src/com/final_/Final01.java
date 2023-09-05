package com.final_;

//final关键字
//适用场景：(类、方法、属性、局部变量)
// 1.想要某个类不能被继承
// 2.想要某个类被继承后里面的方法不可被重写
// 3.不允许修改属性的值
// 4.不允许修改局部变量的值
public class Final01 {
    public static void main(String[] args) {

    }
}

//假如我们想要A类不被继承就可以用final关键字来修饰
final class A {

}

class B {
    //假如想要类被继承后 某个方法不被重写就可以用final来修饰
    public final void hi() {

    }
}

class C extends B {
//    @Override
//    public void hi() {
//        super.hi();
//    }
}

class D {
    //假如想要某个属性不能被修改  就可以用final来修饰
    public final double n1 = 1;
}