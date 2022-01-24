package models;

import resources.IdGenerator;

import java.util.*;

public class User {
    Integer id;
    Integer phoneNumber;
    String email;
    List<Show> showsList;

    public int getId() {
        return id;
    }

    public User(Integer phoneNumber, String email)
    {
        this.id = IdGenerator.generateId();
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.showsList = new ArrayList<Show>();
    }
}