package com.interface_;

public class Computer {
    //接口的多态
    //只要是实现了UsbInterface接口的类都可以传进去
    //接口可以体现多态参数
    public void work(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.stop();
    }
}
