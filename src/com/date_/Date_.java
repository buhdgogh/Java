package com.date_;

// 可以获取当前时间的包
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//第一代日期
public class Date_ {
    public static void main(String[] args) throws ParseException {
        // 1.获取当前的时间
        // 2.这里的Date是在java.util里的类
        // 3.默认的输出格式是国外的方式，因此通常需要对格式进行转换
        java.util.Date date = new java.util.Date();
        System.out.println("当前时间是：" + date);
        // 1.SimpleDateFormat格式转换的类,可以指定相应的格式
        // 2.使用方式：
        // 创建SimpleDateFormat对象
        // 然后调用format()方法，然后用字符串接收
        // 然后输出这个字符串就是按规定的格式输出
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = sdf.format(date);
        System.out.println("当前时间是：" + format);
        // 通过指定毫秒数获取时间
        java.util.Date date1 = new java.util.Date(565161);
        System.out.println("date1所代表的时间为：" + date1);
        String format1 = sdf.format(date1);
        System.out.println("date1所代表的时间为：" + format1);
        // 可以把一个格式化的字符串转成对于的Date
        // 注意：这里的字符串格式要和格式化的规则一致
        String s = "1970年01月01日 08:09:25 星期四";
        java.util.Date parse = sdf.parse(s);
        System.out.println("parse=" + parse);
    }
}
