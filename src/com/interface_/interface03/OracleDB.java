package com.interface_.interface03;

public class OracleDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接Oracle数据库...");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle数据库...");
    }
}
