package com.wrapper_.stringmethod_;

public class StringMethod02 {
    public static void main(String[] args) {
        // 11.String[] str = string.spilt(",");
        // -> 解读：以逗号为标准将string进行分割，
        //         然后将分割的部分分别存放到字符串数组中
        // 在对字符串分割的时候，如果有特殊字符，需要用转义字符
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        String[] poem1 = poem.split(","); //以逗号为标准分割
        System.out.println("split()分割：");
        for (int i = 0;i < poem1.length;i++) {
            System.out.println(poem1[i]);
        }

        // 12.toCharArray(); -> 将一个字符串转成字符数组
        char[] ch = poem.toCharArray();
        System.out.print("字符串转成字符数组：");
        for(int i = 0;i < poem.length();i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();

        // 13.compareTo() -> 比较两字符串的大小，如果前面大就返回正数，后面大返回负数，一样大返回0
        String s1 = "jack";
        String s2 = "jcck";
        String s3 = "jacktom";
        System.out.println("字符串比较函数：" + s1.compareTo(s2));
        System.out.println("字符串比较函数：" + s1.compareTo(s3));

        // 14.format() -> 格式化字符串
        // %s,%d...叫做占位符
        // %.2f 是保留两位小数(会进行四舍五入)
        String s4 = "我是名字是%s,我的年龄是%d";
        String name = "Zhang San";
        int age = 18;
        String s5 = String.format(s4, name,age);
        System.out.println("format格式化字符串：" + s5);
    }
}
