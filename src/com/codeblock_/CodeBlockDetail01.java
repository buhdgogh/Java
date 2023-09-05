package com.codeblock_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

//代码块使用细节
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        // 1.静态代码块和普通代码块的区别：
        //(1) 用static修饰的静态代码块在类加载的时候就会被加载执行 但是*只会执行一次
        //(2) 创建对象的时候不会再执行
        //(3) 普通代码块再创建对象的时候就会被执行 因此普通代码块会被执行多次

        // 2.类什么时候被加载？
        //(1) 在创建对象实例的时候(new)
        //(2) 创建子类对象实例 父类也会被加载
        //(3) 使用类的静态成员(静态属性、静态方法)

        // 3.
        //(1) 普通代码块儿在创建一个对象实例时就会被隐式调用一次 被创建一次 就会被调用一次
        //(2) 如果只是使用类的静态变量 普通代码块不会被调用

        // 总结：
        // 记住静态代码块是在类加载的时候调用 而且只调用一次
        // 普通代码块是在创建(new)对象的时候被调用 每创建一个就会被调用一次


        //AA aa = new AA();
        //在加载类的时候先加载父类再加载子类
        BB bb = new BB();
        System.out.println(Cat.n);

        //static代码块是在类加载的时候执行的 而且只会执行一次
//        DD dd = new DD();
//        DD dd1 = new DD();
        //如果只使用类的静态成员 那么静态代码块不会被执行
        //因为使用类的静态成员只是要加载类 不会创建该类的对象
        //普通代码块只有在创建对象的时候会被执行
        System.out.println(DD.n1);//888 静态代码块一定会被执行 普通代码块不会执行
    }
}

class DD {
    public static int n1 = 888;
    static {
        System.out.println("DD的静态代码块被调用");
    }
    //普通代码块 在new对象的时候会被调用 而且每创建(new)一个对象就会被执行一次
    //普通代码块是否被调用和类是否加载无关
    {
        System.out.println("DD的普通代码块被调用");
    }
}

class Cat {
    public static int n = 1;
    static {
        System.out.println("Cat的静态代码块被调用");
    }
}

class BB extends AA {
    //只有在加载AA类的时候会被调用
    static {
        System.out.println("BB的静态代码块被调用");
    }
    //每创建一个对象就会被调用
    {
        System.out.println("BB的普通代码块被调用");
    }
}

class AA {
    //只有在加载AA类的时候会被调用
    static {
        System.out.println("AA的静态代码块被调用");
    }
    //每创建一个对象就会被调用
    {
        System.out.println("AA的普通代码块被调用");
    }
}