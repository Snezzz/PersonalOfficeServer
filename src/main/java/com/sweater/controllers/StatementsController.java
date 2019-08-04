package com.sweater.controllers;

import com.sweater.entities.Statements;
import com.sweater.services.StatementService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatementsController {
    StatementService statementService;

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

}
