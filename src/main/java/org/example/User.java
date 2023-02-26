package org.example;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class User {
    private String id;
    private String name;
    private boolean active;

    private String email;

    public User(String id, String name, boolean active, String email) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", email='" + email + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public String getEmail() {
        return email;
    }

    public static List<User> getUsers(){
        Faker faker = new Faker();

        ArrayList<User> users = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            User user = new User(faker.idNumber().toString(), faker.name().fullName(), faker.bool().bool(), faker.name().username());
            users.add(user);
        }

        return users;
    }
}
