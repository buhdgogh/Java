package com.homework_.homework09;

public class Homework01 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("交换前str=" + str);
        try {
            str = reverse(str,2,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("交换后str=" + str);
    }

    public static String reverse(String str,int start,int end) {
        // 提高程序健壮性
        // 思路：
        // 1.正确的条件有哪些
        // 2.然后取反
        if (!(str != null && start > 0 && end < str.length() && start < end)) {
            throw new RuntimeException("输入的参数格式不对...");
        }
        // 思路：由于String是一个final，因此不可以被修改
        // 那么我们需要定义一个数组来获取该字符串中的信息，那么char[]里面的元素就是可以换的
        char[] chars = str.toCharArray();
        char temp = ' ';
        for(int i = start,j = end;i < j;i++,j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        // 重新构建一个String返回
        return new String(chars);
    }
}
