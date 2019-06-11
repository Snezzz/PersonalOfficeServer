package com.sweater.controllers;

import com.sweater.entities.Student;
import com.sweater.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //get
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/login/{login}")
    public Student getUser(@PathVariable("login")String login) {
        return userService.getUserByLogin(login);
    }

    //get by id
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/id/{id}")
    public Student getUserById(@PathVariable("id")Integer id) {
        return userService.getUserById(id);
    }

    //get by id
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/users")
    public List<Student> getUsers() {
        return userService.getAllUsers();
    }


    //add
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/user")
    public void addUser(@RequestBody Student student) {
        userService.addUser(student);
    }

    //delete by id
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable int id){
        userService.deleteById(id);
    }

    //update
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/user")
    public void updateUser(@RequestBody Student student)
    {
        userService.addUser(student);
    }


}
