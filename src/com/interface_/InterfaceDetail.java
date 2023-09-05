package com.interface_;

//接口细节：
// 1.一个类可以实现多个接口
// 2.接口可以有属性 属性的修饰符为public static final
// 3.接口不能继承类 但是可以继承多个其他接口
// 4.接口的修饰符只能是默认的或者public
public class InterfaceDetail {
    public static void main(String[] args) {

    }
}

//一个类可以实现多个类 但要实现这些类的所有方法
class Dog implements IB,IC{

    @Override
    public void dog() {

    }

    @Override
    public void Cat() {

    }
}

interface IB {
    void dog();
}

interface IC {
    void Cat();
}

//接口可以有属性 在接口中int n1 = 1; 相当于public static final int n1 = 1;
interface ID {
    int n1 = 1;
    public static final int n2 = 2; //public static final可以不写
}

//接口不能继承类 但是可以继承多个接口
interface IE extends IC,ID {

}

//接口的修饰符只能是 默认的 或者 public
