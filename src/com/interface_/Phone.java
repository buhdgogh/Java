package com.interface_;

public class Phone implements UsbInterface { //实现接口
    // Phone类 来实现 Interface
    // 解读：Phone类必须实现接口类定义或者声明的方法

    //Phone独有的方法
    public void call() {
        System.out.println("我正在打电话...");
    }
    @Override
    public void start() {
        System.out.println("手机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作...");
    }
}
