package lk.ijse.gdse.Task_1.Service.Impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.Task_1.DAO.UserDAO;
import lk.ijse.gdse.Task_1.DTO.UserDTO;
import lk.ijse.gdse.Task_1.Service.UserService;
import lk.ijse.gdse.Task_1.conversion.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Amil Srinath
 */
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;
    private final Mapping map;

    @Override
    public void save(UserDTO userDTO) {
        map.toUserDTO(userDAO.save(map.toUser(userDTO)));
    }

    @Override
    public UserDetailsService userDetailsService() {
        return username ->
                userDAO.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
