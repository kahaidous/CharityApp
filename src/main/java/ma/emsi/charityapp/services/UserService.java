package ma.emsi.charityapp.services;

import ma.emsi.charityapp.DTOs.UserDTO;
import ma.emsi.charityapp.entities.Users;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    void addUser(Users user);
    Users editUser(Users user);
    void deleteUser(Users user);
    Users getUserByCin(String cin);
    List<Users> getAllUsers();
}
