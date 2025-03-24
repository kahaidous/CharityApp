package ma.emsi.charityapp.services;

import ma.emsi.charityapp.entities.Users;
import ma.emsi.charityapp.repositories.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(Users user) {
        //Ajouter la logique metier
        userRepository.save(user);
    }

    @Override
    public Users editUser(Users user) {

        Users u = userRepository.findById(user.getId()).get();
        //set new values

        return userRepository.save(u);
    }

    @Override
    public void deleteUser(Users user) {
            userRepository.deleteById(user.getId());
    }

    @Override
    public Users getUserByCin(String cin) {
        return userRepository.findByCin(cin);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
