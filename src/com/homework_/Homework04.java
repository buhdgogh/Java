package com.homework_;

public class Homework04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //编译类型Calculator  运行类型是匿名内部类
        cellPhone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10 , 20);

        cellPhone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        },10,20);
    }
}

interface Calculator {
    public double work(double n1, double n2);
}

class CellPhone{
    public void testWork(Calculator calculator,double n1,double n2) {
        double result = calculator.work(n1,n2);
        System.out.println("计算的结果是：" + result);
    }
}

