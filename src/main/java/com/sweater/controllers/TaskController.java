package com.sweater.controllers;

import com.sweater.entities.Tasks;
import com.sweater.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TaskController {
    private TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //add
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/task")
    public void addTask(@RequestBody Tasks task) {
        taskService.addTask(task);
    }

    //get all tasks
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/tasks")
    public List<Tasks> getTasks() {
        return taskService.getTasks();
    }

    //delete by date
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/task/{date}")
    public void deleteTaskByDate(@PathVariable Date date) {
        taskService.deleteTaskByDate(date);
    }


}
