package com.sweater.services;

import com.sweater.entities.Student;
import com.sweater.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(Student student){
        userRepository.save(student);
    }

    public void deleteUser(Student student){
        userRepository.delete(student);
    }
    public void deleteById(int id){
        userRepository.deleteById(id);
    }
    public Student getUserByLogin(String login){
        return userRepository.findByLogin(login);
    }
    public Student getUserById(Integer id){
        return userRepository.findById(id).get();
    }

}
