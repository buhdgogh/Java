package com.collection_.set_.hashsetexercise_;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee02("aozi",2000,new MyDate(2003,5,20)));
        hashSet.add(new Employee02("ranran",2500,new MyDate(2003,8,28)));
        hashSet.add(new Employee02("xt",3000,new MyDate(2003,9,13)));
        hashSet.add(new Employee02("aozi",5000,new MyDate(2003,5,20)));
        for (Object o :hashSet) {
            System.out.println(o);
        }

    }
}

class Employee02 {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee02(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee02 that = (Employee02) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return name + " " + sal + " " + birthday;
    }
}

class MyDate {
    public int year;
    public int month;
    public int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myData = (MyDate) o;
        return year == myData.year &&
                month == myData.month &&
                day == myData.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}