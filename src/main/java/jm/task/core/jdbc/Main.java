package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

      UserService userService = new UserServiceImpl();
     // userService.createUsersTable();
      //userService.saveUser("Игорь","Богданов", (byte) 101);
      //userService.removeUserById(3);
      userService.getAllUsers().forEach(System.out::println);
        //userService.cleanUsersTable();
    }
}
