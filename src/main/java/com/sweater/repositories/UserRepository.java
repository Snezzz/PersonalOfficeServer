package com.sweater.repositories;

import com.sweater.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Student,Integer> {
    Student findByLogin(String login);
}
