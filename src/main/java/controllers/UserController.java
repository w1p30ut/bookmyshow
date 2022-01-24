package controllers;

import com.sun.istack.internal.NotNull;
import models.User;
import services.UserService;

public class UserController {
    private static UserService userService = UserService.getInstance();

    public static User createUser(@NotNull int phoneNumber, String email) {
        User u = userService.createUser(phoneNumber, email);
        return u;
    }
}
