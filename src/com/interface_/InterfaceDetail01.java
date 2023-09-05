package com.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        //new IA();
    }
}

// 1.接口不能实例化
// 2.接口中的所有方法都是public  如果接口的方法为抽象方法 可以不写abstract
// 3.一个普通类实现一个接口 那么这个类必须实现这个接口的所有方法 快捷键alt + enter
// 4.抽象类来实现接口 可以不实现接口的方法
interface IA {
    void say();
    void learn();
}

//普通类来实现接口 必须实现这个接口的所有方法
class Cat implements IA {

    @Override
    public void say() {

    }

    @Override
    public void learn() {

    }
}

//抽象类可以不实现接口
abstract class Tiger implements IA {

}