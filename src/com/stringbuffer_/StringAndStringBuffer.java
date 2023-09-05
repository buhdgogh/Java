package com.stringbuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String -> StringBuffer
        //方式一：使用构造器
        String str = "hello";
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式二：append方法
        StringBuffer append = stringBuffer.append(str);

        // StringBuffer -> String
        //方式一：使用StringBuffer中的toString方法
        StringBuffer stringBuffer1 = new StringBuffer(str);
        String string = stringBuffer1.toString();

        //方式二：使用构造器
        String s = new String(stringBuffer1);
    }
}
