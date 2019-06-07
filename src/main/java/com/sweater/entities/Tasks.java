package com.sweater.entities;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "tasks_table")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String task;
    private Date date;
    private Date deadline;
    int student_id;

    public String getDate() {
        return String.valueOf(date).substring(0,19);
    }

    public void setDate(String date) {
            System.out.println("ТУТАААААААААААА");
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

    public Tasks(String task, Date date, Date deadline, int student_id) {
        this.task = task;
        this.date = date;
        this.deadline = deadline;
        this.student_id = student_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }


}
