package ma.emsi.charityapp;

import ma.emsi.charityapp.entities.Users;
import ma.emsi.charityapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class CharityAppApplication implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(CharityAppApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        userRepository.save(
                new Users(null, "Mohamed", "Ahmed","AB1232",new Date())
        );

        userRepository.save(
                new Users(null, "AA", "Yassine","AB1932",new Date())
        );
    }
}
