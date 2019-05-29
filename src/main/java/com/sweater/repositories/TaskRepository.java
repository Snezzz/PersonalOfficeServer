package com.sweater.repositories;

import com.sweater.entities.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface TaskRepository extends JpaRepository<Tasks,Integer> {
    Tasks deleteByDate(Date date);
}
