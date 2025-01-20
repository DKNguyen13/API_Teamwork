package vn.hcmute.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.hcmute.entity.User;
import vn.hcmute.services.AuthService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String Login(@RequestBody User user) {
        return authService.Login(user.getEmail(), user.getPassword());
    }

    @GetMapping("/users")
    public List<User> Users(){
        List<User> u = authService.users();
        System.out.println(u.size());
        return u;
    }
}
