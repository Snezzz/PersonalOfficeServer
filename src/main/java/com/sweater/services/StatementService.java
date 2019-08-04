package com.sweater.services;

import com.sweater.entities.Statements;
import com.sweater.repositories.StatementsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StatementService {
    StatementsRepository statementsRepository;

    @Autowired
    public StatementService(StatementsRepository statementsRepository) {
        this.statementsRepository = statementsRepository;
    }
    public Statements getStatement(String header){
        return statementsRepository.findByHeader(header);
    }
    public List<Statements> getAll(){
        return statementsRepository.findAll();
    }
}
