package com.exception_.trycatch_;
import java.util.Scanner;

public class TryCatchDetail02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("请输入一个整数：");
                int a = Integer.parseInt(scanner.next());
                System.out.println("你输入的数为：" + a);
                //如果输入的数可以转化为整数   也就是上面的语句没有异常
                //那么就会执行break退出while循环
                //如果输入的数不能转化为整数   也就是上面的语句有问题(异常)
                //那么就会终止try下面语句的执行  也就是不会退出
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的数不是整数！");
            }
        }

    }
}
