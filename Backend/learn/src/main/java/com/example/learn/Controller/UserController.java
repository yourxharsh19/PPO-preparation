package com.example.learn.Controller;
import com.example.learn.Model.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users =new ArrayList<>();
    @PostMapping
    public User addUser(@RequestBody User user){
              users.add(user);
              return user;
    }
    @GetMapping
    public List<User> getUsers(){
        return users;
    }
}
