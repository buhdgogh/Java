package com.interface_;

//如果一个类 implements实现 一个接口interface
//那么必须实现该接口所有的抽象类
public class Interface01 {
    public static void main(String[] args) {
        //创建手机、相机类
        Phone phone = new Phone();
        Camera camera = new Camera();
        //创建电脑类
        Computer computer = new Computer();

        computer.work(phone); //相当于把手机连在电脑的接口上
        computer.work(camera); //相当于把相机连在电脑的接口上
    }
}
