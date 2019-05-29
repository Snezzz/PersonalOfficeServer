package com.sweater.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String firstName;
    String sirName;
    String partonymic;
    String login;
    String password;
    String type;
    String course;
    String direction;
    @ManyToMany
    Set<Fees> fees;
    @ManyToMany
    Set<Tasks> tasks;

    Student() {

    }

    public Student(String firstName, String sirName, String partonymic, String login, String password, String type, String course, String direction, Set<Fees> fees, Set<Tasks> tasks) {
        this.firstName = firstName;
        this.sirName = sirName;
        this.partonymic = partonymic;
        this.login = login;
        this.password = password;
        this.type = type;
        this.course = course;
        this.direction = direction;
        this.fees = fees;
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public String getPartonymic() {
        return partonymic;
    }

    public void setPartonymic(String partonymic) {
        this.partonymic = partonymic;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Set<Fees> getFees() {
        return fees;
    }

    public void setFees(Set<Fees> fees) {
        this.fees = fees;
    }

    public Set<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Tasks> tasks) {
        this.tasks = tasks;
    }
}