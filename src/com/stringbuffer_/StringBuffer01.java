package com.stringbuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
        // StringBuffer的父类AbstractStringBuffer中的属性char[] value不是final
        // 可以用于存放字符串中的字符
        // 由于String类的char[] final value 是final修饰的 因此不能被修改
        // 每次被修改都需要重新创建对象，然后分配地址
        // 1.默认创建一个大小为16的字符数组来存放字符
        StringBuffer stringBuffer = new StringBuffer();
        // 2.通过构造器指定char[] value 的大小
        StringBuffer stringBuffer1 = new StringBuffer(32);
        // 3.直接放一个字符串来指定
        StringBuffer zhang_san = new StringBuffer("Zhang San");
    }
}
