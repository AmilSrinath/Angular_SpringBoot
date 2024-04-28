package lk.ijse.gdse.Task_1.reqAndresp.secure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Amil Srinath
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SignUp {
    private String userid;
    private String name;
    private String email;
    private String password;
}
