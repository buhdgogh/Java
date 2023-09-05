package com.final_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

public class FinalExercise01 {
    public static void main(String[] args) {
        Utils utils = new Utils(5);
        System.out.println(utils.calArea());
    }
}

//计算圆的面积
class Utils {
    private final double P_I = 3.14;
    private double radius;

    public Utils(double radius) {
        this.radius = radius;
        //P_I = 3.14;
    }

    public double calArea() {
        return P_I * radius * radius;
    }
}