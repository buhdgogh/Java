package com.interface_;

// 如果接口B继承接口A
// 而且一个类实现了接口B
// 那么就相当于这个类也实现了A
// 这就是所谓的接口多态传递现象
public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        // 接口是特殊的类
        // 接口的变量可以指向实现这个接口的类(对象)
        usbs[0] = new Phone_("Zhang San");
        usbs[1] = new Camera_("Xiao Si");

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].Insert(); //动态绑定
            if (usbs[i] instanceof Phone_) {
                ((Phone_) usbs[i]).call(); //向下转型
            }
        }
    }
}

interface Usb {
    void Insert();
}

class Phone_ implements Usb {
    private String name;

    public Phone_(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println(name + "正在打电话...");
    }

    @Override
    public void Insert() {
        System.out.println("手机插入...");
    }
}

class Camera_ implements Usb {
    private String name;

    public Camera_(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Capture() {
        System.out.println(name + "正在拍照...");
    }

    @Override
    public void Insert() {
        System.out.println("相机插入...");
    }
}

class Pig {
    public void say() {
        System.out.println("我是Pig...");
    }
}