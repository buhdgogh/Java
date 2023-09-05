package com.homework_.homework09;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入用户名：");
        String useName = scanner.next();
        System.out.print("输入密码：");
        String password = scanner.next();
        System.out.print("输入邮箱：");
        String email = scanner.next();
        try {
            userRegister(useName,password,email);
            System.out.println("恭喜你注册成功！");
        } catch (Exception e) {
            System.out.println("发生异常：" + e.getMessage());
        }
    }

    public static void userRegister(String name,String password,String email) {

        if (!(name != null && password != null && email != null)) {
            throw new RuntimeException("参数不能为null");
        }

        // 过关斩将，一个一个的校验
        if (!(name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("用户名长度要求在2~4");
        }

        // 这里单独写一个方法来判断输入的字符串里的字符是否全为数字字符
        if (!(password.length()== 6 && isDigital(password))) {
            throw new RuntimeException("输入的密码要求为数字字符");
        }

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱地址要求有@和.且@在.之前");
        }
    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
