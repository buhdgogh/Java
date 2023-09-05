package com.innerclass_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.nashorn.internal.ir.CallNode;

/**
 * 局部内部类的演示
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.m3();
        System.out.println("实例化的对象outer01的hashCode=" + outer01.hashCode());
    }
}


class Outer01 {
    private int n = 100;
    private void m1(){
        System.out.println("Outer01的m1()方法");
    }

    public void m3() {
        // 1.局部内部类是定义在外部类的局部位置，通常是方法里
        // 2.局部内部类可以访问外部类的所有成员 包括私有的
        // 3.局部内部类就相当于局部变量 局部变量不能用修饰符
        // 4.局部内部类 直接访问 外部类的成员
        //   但是局部变量可以用final
        // 作用域：仅仅是在这个方法或代码块中（其实就是局部内部类实质还是一个局部变量）
        final class Inner01 {
            private void m2() {
                // 5.当外部类和内部类的成员名相同的时候 遵循就近原则
                //   但是如果想要访问外部类的成员
                //   那么可以用外部类名.this.成员的方式访问
                int n = 800;
                // *解读Outer.this.n
                // 外部类的哪个对象调用m2(这个方法)，那么Outer.this.n 就指向这个对象
                System.out.println("Inner01里面的n = " + n + "Outer01的成员n = " + Outer01.this.n);
                System.out.println("Inner01里面Outer01.this的hashCode=" + Outer01.this.hashCode());
                m1();
            }
        }
        Inner01 inner01 = new Inner01();
        inner01.m2();
        // 外部类想要使用内部类 就只能在方法内/代码块内实例化对象 然后调用

//        class Inner01_ extends Inner01 {
//
//        }
        { //代码块
            class Inner03 {

            }
        }
    }
}
