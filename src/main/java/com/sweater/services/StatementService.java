package com.sweater.services;

import com.sweater.entities.Statements;
import com.sweater.repositories.StatementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public void update(Statements statements){
        statementsRepository.save(statements);
    }
    public Statements getStatementByNumber(String number){
        return statementsRepository.findStatementsByNumber(number);
    }

    public void deleteByNumber(String number){
        statementsRepository.delete(getStatementByNumber(number));
    }
}
