package com.interface_;

//继承和接口的比较
// 1.如果子类继承了父类 那么子类就有了父类的功能
// 2.如果子类需要扩展功能，就可以通过实现接口的方式来扩展
// 总结：实现接口是对Java单继承机制的补充
public class ExtendsVSInterface {
    public static void main(String[] args) {
        LitterMonkey wuKong = new LitterMonkey("WuKong");
        wuKong.dance();
        wuKong.swim();
    }
}


class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void dance() {
        System.out.println(name + " 会跳舞...");
    }
}

class LitterMonkey extends Monkey implements FishSwimming,BirdFly {
    public LitterMonkey(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " 通过学习学会了游泳...");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " 通过学习学会了飞...");
    }
}

interface FishSwimming {
    void swim();
}

interface BirdFly {
    void fly();
}