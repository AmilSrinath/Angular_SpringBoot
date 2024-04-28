package lk.ijse.gdse.Task_1.Controller;

import lk.ijse.gdse.Task_1.Service.AuthenticationService;
import lk.ijse.gdse.Task_1.reqAndresp.response.JwtAuthResponse;
import lk.ijse.gdse.Task_1.reqAndresp.secure.SignIn;
import lk.ijse.gdse.Task_1.reqAndresp.secure.SignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Amil Srinath
 */
@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final AuthenticationService authenticationService;

    @GetMapping("/health")
    public String health(){
        return "OK";
    }

    @PostMapping("/signup")
    public ResponseEntity<JwtAuthResponse> signUp(@RequestBody SignUp signUp) {
        return ResponseEntity.ok(authenticationService.signUp(signUp));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthResponse> signIn(@RequestBody SignIn signInReq) {
        return ResponseEntity.ok(authenticationService.signIn(signInReq));
    }
}
