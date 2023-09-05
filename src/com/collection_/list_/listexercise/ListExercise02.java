package com.collection_.list_.listexercise;

import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("1","zxt",99));
        list.add(new Book("2","xyl",88));
        list.add(new Book("3","zxs",55));
        System.out.println("排序前===");
        for (Object book :list) {
            System.out.println(book);
        }
        sort(list);
        System.out.println("排序后===");
        for (Object book :list) {
            System.out.println(book);
        }

    }
    // 集合的排序
    public static void sort(List list) {
        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if(book1.getPrice() > book2.getPrice()) {
                    list.set(j,book2);
                    list.set(j + 1,book1);
                }
            }
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称:\t" + name + "\t\t作者:" + author + "\t\t价格:" + price;
    }
}
