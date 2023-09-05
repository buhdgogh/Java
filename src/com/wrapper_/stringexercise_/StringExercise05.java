package com.wrapper_.stringexercise_;

public class StringExercise05 {
    public static void main(String[] args) {
        Test test = new Test();
        test.f1(test.str,test.ch);
        System.out.print(test.str + " and ");
        System.out.println(test.ch);
    }
}


class Test {
    String str = "zxt";
    final  char[] ch = {'j','a','v','a'};
    public void f1(String str,char[] ch) {
        str = "xyl";
        ch[0] = 'h';
    }
}