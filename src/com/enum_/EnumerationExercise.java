package com.enum_;

public class EnumerationExercise {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        Weekday[] weekday = Weekday.values();
        for (Weekday day :
                weekday) {
            System.out.println(day.getName());
        }
    }
}

enum Weekday {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;
    Weekday(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
