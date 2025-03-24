package ma.emsi.charityapp.repositories;

import ma.emsi.charityapp.entities.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users,Long> {
    Users findByCin(String cin);

}
