package com.date_;

import java.util.Calendar;

//第二代日期
public class Calendar_ {
    public static void main(String[] args) {
        // 1.Calendar类是一个抽象类，他的构造器是私有的
        // 2.可以通过getInstance来获取对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        // 获取日历对象的字段信息
        System.out.println("年：" + c.get(Calendar.YEAR));
        // 月默认返回是从0开始，因此要加一
        System.out.println("月：" + (c.get(Calendar.MONTH) + 1));
        System.out.println("日：" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + c.get(Calendar.HOUR));
        System.out.println("分：" + c.get(Calendar.MINUTE));
        System.out.println("秒：" + c.get(Calendar.SECOND));
        // Calendar没有提供对应的格式化方法，因此需要程序员自己组合
        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月" + c.get(Calendar.DATE) + "日");
    }
}
