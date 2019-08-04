package com.sweater.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "statements")
public class Statements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private Date creationDate;
    String header;
    String text;

    public Statements(Date creationDate, String header, String text) {
        this.creationDate = creationDate;
        this.header = header;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
