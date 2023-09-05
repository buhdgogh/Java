package com.date_;

import sun.security.jca.GetInstance;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//第三代日期
public class LocalDateTime_ {
    public static void main(String[] args) {
        // 1.now() 返回当前日期时间的对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("年：" + ldt.getYear());
        System.out.println("月：" + ldt.getMonth());
        System.out.println("月：" + ldt.getMonthValue());
        System.out.println("日：" + ldt.getDayOfMonth());
        System.out.println("日：" + ldt.getDayOfWeek());
        System.out.println("日：" + ldt.getDayOfYear());
        System.out.println("时：" + ldt.getHour());
        System.out.println("分：" + ldt.getMinute());
        System.out.println("秒：" + ldt.getSecond());

        // 2.仅获取年月日
        LocalDate now = LocalDate.now();
        System.out.println(now.getYear());
//        System.out.println(now.getHour());
        // 3.仅获取时分秒
        LocalTime now1 = LocalTime.now();
        System.out.println(now1.getHour());
//        System.out.println(now1.getYear());

        // 4.DateTimeFormatter 格式化时间
        // 1)创建DateTimeFormatter对象，并指定输出格式
        // 2)调用format方法，对时间进行格式化，返回一个字符串接收
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd月 HH:mm:ss");
        String s = dtf.format(ldt);
        System.out.println(s);

        // 5.时间戳
        // 1)通过静态方法now来获取时间戳对象
        Instant now2 = Instant.now();
        System.out.println(now2);
        // 2)通过from方法把Instant转成Date
        Date date = Date.from(now2);
        // 3)通过toInstant方法把Date转成Instant
        Instant instant = date.toInstant();

        // 6.提供plus 和 minus方法来在当前时间的基础上进行时间的加或职责减
        LocalDateTime localDateTime = ldt.plusDays(890);
        LocalDateTime localDateTime1 = ldt.minusDays(890);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);
    }
}
