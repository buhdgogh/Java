package com.stringbuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {
        // 1.append()方法
        StringBuffer s1 = new StringBuffer("ZxtAndXyl");
        s1.append(" is handsome");
        System.out.println(s1);

        // 2.delete(int start,int end)方法
        //   删除 >=start 和 <end 之间的字符
        s1.delete(3,6);
        System.out.println(s1);

        // 3.replace(int start,int end,String string)
        // 替换索引从start(包含)到end(不包含)的字符串 [start,end)
        s1.replace(10,19,"beautiful");
        System.out.println(s1);

        // 4.indexOf()
        // 查找指定字串在字符串中的位置
        int index = s1.indexOf("Zxt");
        System.out.println(index);

        // 5.insert()
        // 在指定位置插入要插入的字符串,后面的字符就往后移
        s1.insert(3," And ");
        System.out.println(s1);

        // 6.length()
        // 获取字符串的长度
        int i = s1.length();
        System.out.println(i);


    }
}
