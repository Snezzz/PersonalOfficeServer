package com.sweater.services;

import com.sweater.entities.Direction;
import com.sweater.entities.Fees;
import com.sweater.repositories.DirectionRepository;
import com.sweater.repositories.FeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectionService {
    DirectionRepository directionRepository;

    @Autowired
    public DirectionService(DirectionRepository directionRepository) {
        this.directionRepository = directionRepository;
    }


    public List<Direction> getAll(){
        return directionRepository.findAll();
    }
}
