package com.wrapper_.stringmethod_;

public class StringMethod01 {
    public static void main(String[] args) {
        // 1.equals() -> 比较字符串内容是否相等(区分大小写)
        String str1 = "Zxt";
        String str2 = "zxt";
        System.out.println("str1和str2区分大小写比较：" + str1.equals(str2));
        // 2.equalsIgnoreCase() -> 比较字符串内容是否相等(不区分大小写)
        System.out.println("str1和str2不区分大小写比较：" + str1.equalsIgnoreCase(str2));
        // 3.length() -> 获取字符个数，字符串的长度
        System.out.println("str1的长度：" + str1.length());
        // 4.indexOf() -> 返回一个字符在字符串中第一次出现的位置(如果没找到就返回-1)
        String str3 = "ZxtZx";
        System.out.println("Z在字符串第一次出现的位置：" + str3.indexOf('Z'));
        System.out.println("Zx子字符串第一次出现的位置：" + str3.indexOf("Zx"));
        // 5.lastIndexOf() -> 返回字符在字符串中的最后一次出现的位置(如果没有找到就返回-1)
        System.out.println("Z在字符串最后一次出现的位置：" + str3.lastIndexOf('Z'));
        System.out.println("Zx子字符串最后一次出现的位置：" + str3.lastIndexOf("Zx"));
        // 6.(1)substring(int begin) -> 相当于从begin开始到结束
        //   (2)substring(int begin,int end) -> 截取指定范围的字串(begin <= length < end)
        String name = "hello,张三";
        System.out.println("截取指定范围的字串：" + name.substring(6));
        System.out.println("截取指定范围的字串：" + name.substring(1,3));
        // 7.toUpperCase() -> 转换为大写的字符
        String str4 = "hello";
        System.out.println("转成大写：" + str4.toUpperCase());
        // 8.toLowerCase() -> 转成小写的字符
        String str5 = "ZXT";
        System.out.println("转成小写：" + str5.toLowerCase());
        // 9.concat() -> 拼接字符串
        String str6 = "暴雨";
        str6 = str6.concat("小雨").concat("暴风雨").concat("嘶~");
        System.out.println("字符串连接：" + str6);
        // 10.replace() -> 替换字符串中的字符
        // replace() 执行后返回的结果才是替换后的字符串 如果是 s1 = s1.replace() 本身对s1本身没有影响
        // 将 "嘶~" 全部换为 "龙卷风"
        str6 = str6.replace("嘶~","龙卷风");
        System.out.println("替换字符串中的字符：" + str6);

    }
}
