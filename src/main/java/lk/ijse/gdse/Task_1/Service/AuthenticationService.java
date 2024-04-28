package lk.ijse.gdse.Task_1.Service;


import lk.ijse.gdse.Task_1.reqAndresp.response.JwtAuthResponse;
import lk.ijse.gdse.Task_1.reqAndresp.secure.SignIn;
import lk.ijse.gdse.Task_1.reqAndresp.secure.SignUp;

/**
 * @author Amil Srinath
 */
public interface AuthenticationService {
    JwtAuthResponse signIn(SignIn signIn);
    JwtAuthResponse signUp(SignUp signUp);
}
