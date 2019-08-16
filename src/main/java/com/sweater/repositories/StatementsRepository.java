package com.sweater.repositories;

import com.sweater.entities.Statements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatementsRepository extends JpaRepository<Statements,Integer> {
    Statements findByHeader(String header);
    Statements findStatementsByNumber(String number);
    void deleteByNumber(String number);
}
