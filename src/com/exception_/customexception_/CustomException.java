package com.exception_.customexception_;

public class CustomException {
    public static void main(String[] args) {
        int age = 70;
        if(!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18-120之间！");
        }
        System.out.println("你的年龄范围是正确的");
    }
}

//自定义一个异常
// 1.一般来说我们将自定义异常定义为运行时异常，也就是继承运行时异常
// 2.这样做的好处是可以利用默认的处理机制
// 3.因此，自定义异常定义为运行时异常会比较方便

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}