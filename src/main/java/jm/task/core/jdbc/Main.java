package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Petrov", (byte) 10);
        userService.saveUser("Michel", "Shumackher", (byte) 11);
        userService.saveUser("Alina", "Kabaeva", (byte) 12);
        userService.saveUser("Dmitry", "Axonskiy", (byte) 13);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}