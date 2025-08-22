package com.example.learn.Controller;

import com.example.learn.Model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Map<Integer, User> users = new HashMap<>();
    private final AtomicInteger idCounter = new AtomicInteger(0);

    // GET all users
    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(new ArrayList<>(users.values()));
    }

    // GET user by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        User user = users.get(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    // ADD new user
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        int id = idCounter.incrementAndGet();
        users.put(id, user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    // UPDATE user by ID
    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable int id, @RequestBody User user) {
        if (users.containsKey(id)) {
            users.put(id, user);
            return ResponseEntity.ok("User updated successfully!");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    // DELETE user by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        if (users.containsKey(id)) {
            users.remove(id);
            return ResponseEntity.ok("User deleted successfully!");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }
}
