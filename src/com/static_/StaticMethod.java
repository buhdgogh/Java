package com.static_;

//静态方法
public class StaticMethod {
    public static void main(String[] args) {
        Stu mary = new Stu("mary");
        Stu.payFee(5000);
        Stu jack = new Stu("jack");
        Stu.payFee(5000);
        Stu.showFee();

        //如果我们想要不实例化某个对象就可以调用里面的方法(这个方法当作工具来使用)
        //我们就可以将该方法设置为静态方法static
        //也就是当方法中不含有当前类的成员变量的时候，就可以将该类设置为静态变量
        System.out.println("9的开平方为：" + Math.sqrt(9));
        System.out.println(MyTools.calSum(1,2));

        //静态方法中不允许出现this super这些和对象相关的关键字 但是普通方法可以
        //静态方法中只允许访问 静态变量 或 静态方法 但是普通方法既可以访问静态变量也可以访问非静态变量
        //总结：静态方法只允许访问静态变量    普通变量既可以访问静态变量也可以访问非静态变量

    }
}

//开发自己的工具类的时候可以将方法设置为静态方法 方便调用
class MyTools {
    public static double calSum(double a,double b) {
        return a + b;
    }
    //可以写出很多这样的工具方法...
}

class Stu {
    private String name; //普通成员
    //定义一个静态变量,来累计学生的学费
    private static double fee = 0; //静态变量

    public Stu(String name) {
        this.name = name;
    }

    //静态方法
    public static void payFee(double fee) {
        Stu.fee += fee; //将输入的费用累计到静态变量fee
    }

    public static void showFee() {
        System.out.println("学费累计为：" + Stu.fee);
    }
}