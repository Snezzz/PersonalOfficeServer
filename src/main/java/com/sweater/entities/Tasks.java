package com.sweater.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "tasks_table")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    String Task;
    @NotNull
    Date date;
    Date deadline;

    public String getDate() {
        return String.valueOf(date).substring(0,19);
    }

    public void setDate(String date) {

        try {
            this.date = new SimpleDateFormat("dd.MM.yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public String getDeadline() {
        return String.valueOf(deadline).substring(0,19);
    }

    public void setDeadline(String deadline) {

        try {
            this.deadline = new SimpleDateFormat("dd.MM.yyyy").parse(deadline);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }



    Tasks(){

    }

    public Tasks(String task, Date date, Date deadline) {
        Task = task;
        this.date = date;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }


}
