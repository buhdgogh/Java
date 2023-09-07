package com.generic_.homework_;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001",new User(1,18,"jack"));
        userDAO.save("002",new User(2,20,"tom"));
        userDAO.save("003",new User(3,21,"smith"));

        List<User> users = userDAO.list();

        System.out.println("list" + users);
    }

}
