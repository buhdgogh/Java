package com.stringbuffer_.stringbufferexercise_;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        //*学会看源码
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer);
        //空指针异常
        //注意区分null和"null"
        StringBuffer stringBuffer1 = new StringBuffer(str);
        System.out.println(stringBuffer1);
    }
}
