package com.wrapper_.integer_;

//演示手动拆装箱和自动拆装箱
public class Integer01 {
    public static void main(String[] args) {

        //在jdk5之前(手动)
        //手动装箱 int -> Integer
        int i = 10;
        Integer i1 = new Integer(i);
        Integer i2 = Integer.valueOf(i);

        //手动拆箱 Integer -> int
        Integer j = new Integer(99);
        int j1 = j.intValue();


        //在jdk5之后(自动)
        //自动装箱 int -> Integer
        int m = 10;
        Integer m1 = m; //底层仍然是 Integer.valueOf(m);   所本质没有变化

        //自动拆箱 Integer -> int
        Integer n = new Integer(99);
        int n1 = n;  //底层仍然是 n.intValue();   本质没有变化
        System.out.println(n + 100);
        System.out.println(n * 2);

        Double d = 100d;
        Float f = 1.5f;
        System.out.println(d);
        System.out.println(f);
    }
}
