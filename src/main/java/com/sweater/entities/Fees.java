package com.sweater.entities;

import javax.persistence.*;

@Entity
@Table(name = "fees_table")
public class Fees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String subject;
    String lecturer;
    String type;
    int semester;
    int course;
    String fee;
    int studentId;

    Fees(){

        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public int getStudent_id() {
        return studentId;
    }

    public void setStudent_id(int student_id) {
        this.studentId = student_id;
    }

    public Fees(String subject, String lecturer, String type, int semester, int course, String fee, int student_id) {
        this.subject = subject;
        this.lecturer = lecturer;
        this.type = type;
        this.semester = semester;
        this.course = course;
        this.fee = fee;
        this.studentId = student_id;
    }
}
