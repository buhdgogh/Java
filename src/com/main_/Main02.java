package com.main_;

//main方法传递参数（args数组中保存执行java命令传递给运行类型的参数）
public class Main02 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args的第" + (i + 1) + "个参数为：" + args[i]);
        }
    }
}
