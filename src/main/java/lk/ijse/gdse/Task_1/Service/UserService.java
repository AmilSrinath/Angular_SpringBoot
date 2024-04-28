package lk.ijse.gdse.Task_1.Service;

import lk.ijse.gdse.Task_1.DTO.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Amil Srinath
 */
public interface UserService {
    void save(UserDTO userDTO);
    UserDetailsService userDetailsService();
}
