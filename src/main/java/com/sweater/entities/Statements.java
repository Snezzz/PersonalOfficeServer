package com.sweater.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "statements")
public class Statements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    public String number;
    private Date creationDate;
    private String header;
    private String text;
    private String status;
    int student_id;

    Statements (){
    }
    public Statements(String number, Date creationDate, String header, String text, String status,int student_id) {
        this.number = number;
        this.creationDate = creationDate;
        this.header = header;
        this.text = text;
        this.status = status;
        this.student_id = student_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}
