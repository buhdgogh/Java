package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅",90);
        books[2] = new Book("青年文摘2022",5);
        books[3] = new Book("java从入门到放弃",300);
        books[4] = new Book("java从入门到精通",200);

        // 1.按书籍价格从小到大排序(定制排序)
        Arrays.sort(books, new Comparator<Book>() {
            // 由于这里是对books数组排序，因此这里的o1、o2是Book对象
            @Override
            public int compare(Book o1, Book o2) {
                Double i1 = o1.getPrice();
                Double i2 = o2.getPrice();
                // 由于compare需要返回一个整数，因此需要设置一个变量
                // 用来接收大小的比较，然后判断这个数的正负，再来返回正负的整数
                double d = i1 - i2;
                // 差值小于0，就是从小到大排序
                if (d < 0) {
                    return -1;
                } else if (d > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("按书籍的价格从小到大排序为：");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

        // 2.按价格从大到小排序(定制排序)
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Double i1 = o1.getPrice();
                Double i2 = o2.getPrice();
                double d = i1 - i2;
                // 差值大于0，就是从大到小排序
                if (d < 0) {
                    return 1;
                } else if (d > 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("按书籍的价格从大到小排序为：");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

        // 3.按照名字的长度从大到小排序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int i1 = o1.getName().length();
                int i2 = o2.getName().length();
                return i2 - i1;
            }
        });

        System.out.println("按书籍名字的长度从大到小排序为：");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
