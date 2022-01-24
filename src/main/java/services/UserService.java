package services;

import models.*;
import java.util.*;

public class UserService {
    private HashMap<Integer, User> usermap;
    private HashMap<Integer, List<Booking>> userBookingMap;
    private static UserService instance = null;

    public UserService() {
        usermap = new HashMap<>();
        userBookingMap = new HashMap<>();
    }

    public static UserService getInstance() {
        if(instance == null)
        {
            instance = new UserService();
        }
        return instance;
    }

    public User createUser(int phoneNumber, String email) {
        User u =  new User(phoneNumber, email);
        this.usermap.put(u.getId(), u);
        return u;
    }

    public User getUser(int userId)
    {
        return usermap.get(userId);
    }
}