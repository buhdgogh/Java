package com.wrapper_.stringexercise_;

public class StringExercise02 {
    public static void main(String[] args) {
        /*
        intern:
        public String intern()返回字符串对象的规范化表示形式。
        一个初始为空的字符串池，它由类 String 私有地维护。
        当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串
        （用 equals(Object) 方法确定），则返回池中的字符串。
        否则，将此 String 对象添加到池中，并返回此 String 对象的引用。
        它遵循以下规则：对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，
        s.intern() == t.intern() 才为 true。
        所有字面值字符串和字符串赋值常量表达式都使用 intern 方法进行操作。
        字符串字面值在 Java Language Specification 的 §3.10.5 定义。
        返回：
        一个字符串，内容与此字符串相同，但一定取自具有唯一字符串的池。
         */
        //总结：
        // intern()方法返回的是一个地址。
        // 1.如果一个字符串是按直接赋值的方式创建的那么这个字符串指向常量池的一块区域
        //   并且这个字符串的intern()方  法所返回的地址就是该常量池的那一块区域
        // 2.如果一个字符串是按调用构造器的方式创建的，那么该字符串所指向的是堆上开辟的
        //   一块对象存储区域，而他的intern()方法返回的是常量池上的字符常量的地址，他们是不同的
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.equals(s2)); //T
        System.out.println(s1 == s2); //F
        System.out.println(s1 == s2.intern()); //T
        System.out.println(s2 == s2.intern()); //F
    }
}
