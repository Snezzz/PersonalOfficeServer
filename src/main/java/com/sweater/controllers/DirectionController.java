package com.sweater.controllers;

import com.sweater.entities.Direction;
import com.sweater.entities.Fees;
import com.sweater.services.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DirectionController {
    private DirectionService directionService;

    @Autowired
    public DirectionController(DirectionService directionService) {
        this.directionService = directionService;
    }

    //все оценки
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/directions")
    public List<Direction> getAllFees() {
        return directionService.getAll();
    }


}
