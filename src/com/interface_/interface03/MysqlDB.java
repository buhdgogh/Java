package com.interface_.interface03;

public class MysqlDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接MySQL数据库...");
    }

    @Override
    public void close() {
        System.out.println("关闭MySQL数据库...");
    }
}
