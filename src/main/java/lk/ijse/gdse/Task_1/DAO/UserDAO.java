package lk.ijse.gdse.Task_1.DAO;

import lk.ijse.gdse.Task_1.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Amil Srinath
 */
public interface UserDAO extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
