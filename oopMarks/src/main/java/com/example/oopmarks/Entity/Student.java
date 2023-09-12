package com.example.oopmarks.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id

    private String studentId;
    private String studentName;
    private int caMarks;
    private int practicalMarks;
    private int theoryMarks;

    private double finalMarks;
    public double getFinalMarks() {
        return finalMarks;
    }

    public void setFinalMarks(double finalMarks) {
        this.finalMarks = finalMarks;
    }



    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = String.valueOf(studentId);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCaMarks() {
        return caMarks;
    }

    public void setCaMarks(int caMarks) {
        this.caMarks = caMarks;
    }

    public int getPracticalMarks() {
        return practicalMarks;
    }

    public void setPracticalMarks(int practicalMarks) {
        this.practicalMarks = practicalMarks;
    }

    public int getTheoryMarks() {
        return theoryMarks;
    }

    public void setTheoryMarks(int theoryMarks) {
        this.theoryMarks = theoryMarks;
    }

    public String toString(){
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", caMarks=" + caMarks +
                ", practicalMarks=" + practicalMarks +
                ", theoryMarks=" + theoryMarks +
                ", finalMarks=" + finalMarks +
                '}';
    }
}
