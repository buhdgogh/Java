package com.generic_;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("zhangsan",20000,new MyDate(2003,9,11)));
        employees.add(new Employee("lisi",20000,new MyDate(2001,4,23)));
        employees.add(new Employee("wangwu",20000,new MyDate(2003,8,27)));
        System.out.println("排序前" + employees);

        //自定义排序(先按照名字,然后在按照出生)
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof Employee && o1 instanceof Employee)) {
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if(i != 0) {
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println("排序后" + employees);
    }
}
