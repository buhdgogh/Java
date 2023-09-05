package com.interface_.interface03;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        link(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        link(oracleDB);
    }

    public static void link(DBInterface dbInterface){
        dbInterface.connect();
        dbInterface.close();
    }
}
