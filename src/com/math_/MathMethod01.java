package com.math_;

public class MathMethod01 {
    public static void main(String[] args) {
        // 1.abs() -> 绝对值
        System.out.println(Math.abs(-1.1)); //1.0
        // 2.pow() -> 求幂
        System.out.println(Math.pow(2,3)); //8.0
        // 3.ceil() -> 向上取整(返回大于等于该数的最小整数)
        System.out.println(Math.ceil(3.1)); //4.0
        // 4.floor() -> 向下取整(返回小于等于该数的最大整数)
        System.out.println(Math.floor(3.1)); //3.0
        // 5.round() -> 四舍五入
        System.out.println(Math.round(3.4)); //3
        System.out.println(Math.round(3.6)); //4
        // 6.sqrt() -> 开方
        System.out.println(Math.sqrt(9)); //3.0
        // 7.random() -> 返回一个随机数 [0,1)
        // 返回[a,b)之间的整数,(int)Math.random() * (b - a + 1) + a;
        // 解释：由于Math.random()的返回值为[0,1)
        // 因此上式的最小值为a，最大值就是b - a + 1 + a
        // 注意不是取等，因此最大值为b + 1 由于最大的b + 1不能取到，
        // 只能取到接近的b + 1，因此在强制类型转换后的最大取值为b
        System.out.println(Math.random());
        // 获取2-7之间的整数
        System.out.println((int)(Math.random() * 6 + 2));
        // 8.max() 获取最大值
        int max = Math.max(3, 9);
        // 9.min() 获取最小值
        int min = Math.min(12, 5);
    }
}
