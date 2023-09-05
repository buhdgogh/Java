package com.homework_.homework08;


import java.util.concurrent.Callable;

public class Homework08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();

        switch(green) {
            case RED:
                System.out.println("匹配到红色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            default:
                System.out.println("未能匹配的颜色");
        }
    }
}
