package com.sweater.services;

import com.sweater.entities.Tasks;
import com.sweater.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {
    TaskRepository taskRepository;
    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Tasks> getTasks(){
        return taskRepository.findAll();
    }
    public void addTask(Tasks task){
        taskRepository.save(task);
    }
    public void deleteTask(Tasks task){
        taskRepository.delete(task);
    }
    public void deleteTaskByDate(Date date){
        taskRepository.deleteByDate(date);
    }

}
