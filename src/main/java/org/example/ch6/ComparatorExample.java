package org.example.ch6;

import org.example.User;

import java.util.Comparator;
import java.util.List;

public class ComparatorExample {


    public static void main(String[] args) {
        List<User> users = User.getUsers();
        System.out.println(users);
        Comparator<User> comp = Comparator.comparing((user) -> user.getName());
        Comparator<String> comp1 = Comparator.comparing((str) -> str);
        users.sort(comp);
        System.out.println(users);
    }
}
