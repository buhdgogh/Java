package com.exception_.homework_;

public class HomeWork01 {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new ArrayIndexOutOfBoundsException("参数个数不为2！");
        }

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = new EcmDef().cal(n1,n2);
            System.out.println(res);
        } catch (NumberFormatException e) {
            System.out.println("输入的格式不对！");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0！");
        }

    }
}

class EcmDef {
    public double cal(int n1,int n2) {
        return n1 / n2;
    }
}

class Arithmetic extends RuntimeException {
    public void f1() {
        System.out.println("除数不能为0！");
    }
}
