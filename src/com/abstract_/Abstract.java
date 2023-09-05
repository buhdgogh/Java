package com.abstract_;

public class Abstract {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //思考：这里eat方法虽然实现了 但是没有什么意义
    //即： 父类方法的不确定性
    //那么可以将该方法设计为抽象(abstract)方法
    //所谓的 抽象方法 就是没有具体的实现方法
    //所谓的 没有实现方法 就是没有方法体
    //一个类中的方法为抽象方法 这个类也要写成抽象类
    public abstract void eat();
}