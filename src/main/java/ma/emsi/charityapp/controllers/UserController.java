package ma.emsi.charityapp.controllers;

import ma.emsi.charityapp.entities.Users;
import ma.emsi.charityapp.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<Users> getUsers(){
        return userService.getAllUsers();
    }
}
