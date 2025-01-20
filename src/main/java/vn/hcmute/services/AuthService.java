package vn.hcmute.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.hcmute.entity.User;
import vn.hcmute.repository.UserRepository;

import java.util.List;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public String Login(String username, String password){
        if(userRepository.findByEmailAndPassword(username, password).isPresent()){
            return "Login success";
        }
        return "Invalid username or password";
    }

    public List<User> users (){
        return userRepository.findAll();
    }
}
