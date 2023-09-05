package com.collection_.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1,new Employee("zxt",20000));
        hashMap.put(2,new Employee("and", 25000));
        hashMap.put(3,new Employee("handsome", 30000));

        Set set1 = hashMap.keySet();
        for (Object o : set1) {
            Employee employee = (Employee)hashMap.get(o);
            if(employee.getSalary() >= 18000) {
                System.out.println(employee);
            }
        }

        System.out.println("===========");
        Set set = hashMap.entrySet();
        for (Object entry : set) {
            Map.Entry entry1 = (Map.Entry) entry;
            if(entry1.getValue() instanceof Employee) {
                Employee employee = (Employee) entry1.getValue();
                if (employee.getSalary() > 18000) {
                    System.out.println(employee);
                }
            }
        }

    }
}

class Employee {
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
