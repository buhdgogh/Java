package com.exception_;

//异常Exception
public class Exception01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
//        try {
              //这里相当于 10 / 0 除数不能为0
              //当程序执行到这里就会出现异常   程序退出-->崩溃了...
//            int result = n1 / n2;
//            System.out.println(result);
//        } catch(java.lang.Exception e) {
//            System.out.println("你是运算有误！" + e.getMessage());
//        } finally {
//            System.out.println("程序运行结束！");
//        }
        System.out.println("Hello");
        try {
            int result = n1 / n2;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

