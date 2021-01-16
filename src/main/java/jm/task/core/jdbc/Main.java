package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Петр","Петров", (byte) 44);
        userService.saveUser("Иван","Иванов", (byte) 34);
        userService.saveUser("Сергей","Сергеев", (byte) 18);
        userService.saveUser("Аристарх","Аристархов", (byte) 99);
        List<User> results = userService.getAllUsers();
        results.forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
