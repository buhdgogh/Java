package com.interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        UsbInterface[] usbInterface = new UsbInterface[2];
        usbInterface[0] = new Phone();
        usbInterface[1] = new Camera();
        for (int i = 0; i < usbInterface.length; i++) {
            usbInterface[i].start();
            usbInterface[i].stop();
            if (usbInterface[i] instanceof Phone) {
                ((Phone)usbInterface[i]).call();
            }
        }
    }
}
