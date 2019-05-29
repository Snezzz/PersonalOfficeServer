package com.sweater.controllers;

import com.sweater.entities.Student;
import com.sweater.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //get
    @CrossOrigin(origins = "http://localhost:")
    @GetMapping("/user/{login}")
    public Student getFilterCourseFees(@PathVariable("login")String login) {
        return userService.getUserByLogin(login);
    }

    //add
    @CrossOrigin(origins = "http://localhost:")
    @PostMapping("/user")
    public void addUser(@RequestBody Student student) {
        userService.addUser(student);
    }

    //delete by id
    @CrossOrigin(origins = "http://localhost:")
    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable int id){
        userService.deleteById(id);
    }

    //update
    @CrossOrigin(origins = "http://localhost")
    @PutMapping("/user")
    public void updateUser(@RequestBody Student student)
    {
        userService.addUser(student);
    }


}
