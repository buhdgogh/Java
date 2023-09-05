package com.final_;

public class FinalDetail01 {
    public static void main(String[] args) {

    }
}

//普通final属性的初始化位置：
// 1、定义的时候初始化
// 2、在构造器中初始化
// 3、在代码块中初始化

class AA {
    public final double TAX_RATE1 = 0.1; //1、定义的时候赋值
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() { //在构造器中赋初值
        TAX_RATE2 = 0.2;
    }

    {//在代码块中赋初值
        TAX_RATE3 = 0.3;
    }
}

//静态final属性的初始化位置：
// 1、定义的时候初始化
// 2、静态代码块中初始化  不能在构造器中初始化
// 之所以不能在构造器中初始化是因为静态属性是在类加载的时候初始化的
// 而构造器是在创建对象的时候调用的 二者相冲突

class BB {
   public static final double TAX_RATE1 = 0.4;
//   public static final double TAX_RATE2;
   public static final double TAX_RATE3;

    public BB() {
        //不可在构造器中对静态的final属性初始化
        //因为
//        TAX_RATE2 = 0.5;
    }

    static {
        TAX_RATE3 = 0.6;
    }
}

//final类是不可被继承 但是可以实例化
final class CC {

}

class DD {
    //子类是可以继承父类的final方法 但是不能对final方法进行重写
    public final void hi() {

    }
}