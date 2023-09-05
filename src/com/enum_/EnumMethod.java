package com.enum_;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class EnumMethod {
    public static void main(String[] args) {
        //获取枚举类的AUTUMN对象
        Season2 autumn = Season2.AUTUMN;

        // 1.name()方法 来获取这个枚举对象的名字
        System.out.println(autumn.name());
        // 2.ordinal()方法 来获取这个枚举类的位置(从0开始)
        System.out.println(autumn.ordinal());
        // 3.values()方法 返回的是这个枚举类所有的类组成的数组
        // 从反编译可以看出 values()方法  返回Season2数组
        Season2[] season = Season2.values();
        for (int i = 0; i < season.length; i++) {
            System.out.println(season[i]);
        }
        //foreach
        for (Season2 value:season) { //指向流程：依次从数组season中取出元素赋给value  直到遍历完
            System.out.println(value);
        }

        // 4.valueOf()方法 将字符串转化为枚举对象  然后返回这个对象
        Season2 season1 = Season2.valueOf("AUTUMN");
        System.out.println("season1=" + season1);
        System.out.println(season1.equals(Season2.AUTUMN));

        // 5.compareTo()方法 比较两个枚举常量，比较的是编号
        // 返回前面的枚举对象的编号 - 后面的枚举对象的编号
        System.out.println(Season2.SUMMER.compareTo(Season2.SPRING));
    }
}




