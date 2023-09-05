package com.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        // 集合的迭代器
        Collection col = new ArrayList();
        col.add(new Book("成功","zxt",99.9));
        col.add(new Book("sad","xyl",65.6));
        col.add(new Book("adsa","asdafc",45.4));

        // 1.想要遍历集合的每一个元素
        Iterator iterator = col.iterator();
        // 可以使用快捷键快速生成迭代器的while循环 -> itit+回车
        // 查看所有的快捷键 ctrl + j
        System.out.println("第一次遍历===");
        while(iterator.hasNext()) { //判断迭代器后面是否还有元素
            // next虽然得到的是集合的下一个元素，但是返回的是Object类型
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        // 当第一次遍历完集合后，迭代器指向的是集合的最后一个元素
        // 如果想要再次遍历，需要将迭代器重置
        // 2.第二次遍历
        System.out.println("第二次遍历===");
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);
        }


    }
}

class Book {
    private String bookName;
    private String author;
    private double price;

    public Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
