package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

      UserService userService = new UserServiceImpl();
      userService.createUsersTable();
      userService.saveUser("ddd","fdfdgfvb fgb", (byte) 101);
    }
}
