package com.generic;

import java.util.*;

@SuppressWarnings({"all"})
public class GenericExercise01 {
    public static void main(String[] args) {
        //HashSet
        Set<Student> students1 = new HashSet<Student>();
        students1.add(new Student("zhangsan",1));
        students1.add(new Student("lisi",2));
        students1.add(new Student("wangwu",3));
        for (Student student : students1) {
            System.out.println("name = " + student.name + " age = " + student.age);
        }
        Iterator<Student> iterator = students1.iterator();
        while(iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println("name = " + s.name + " age = " + s.age);

        }
        //HashMap
        Map<String, Student> students2 = new HashMap<String, Student>();
        students2.put("zhaoliu",new Student("zhanliu",4));
        students2.put("xiaoba",new Student("xiaoba",5));
        students2.put("laojiu",new Student("laojiu",6));
        //迭代器 EntrySet
        Set<Map.Entry<String, Student>> entries = students2.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next = iterator1.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }
}
class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
