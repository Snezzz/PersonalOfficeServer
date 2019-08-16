package com.sweater.controllers;

import com.sweater.entities.Statements;
import com.sweater.services.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StatementsController {
    private StatementService statementService;

    @Autowired
    public StatementsController(StatementService statementService) {
        this.statementService = statementService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/statements")
    List<Statements> getAll(){
        return statementService.getAll();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/statements/{header}")
    Statements getByName(@PathVariable("header")String header){
        return statementService.getStatement(header);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/statement")
    public void updateStatements(@RequestBody Statements statements)
    {
        statementService.update(statements);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/statement")
    public void delete(@RequestBody String number){
        statementService.deleteByNumber(number);
    }
}
