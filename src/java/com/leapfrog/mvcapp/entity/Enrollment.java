/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcapp.entity;

import java.sql.Timestamp;

/**
 *
 * @author Anuz
 */
public class Enrollment {
     private int enrollmentId;
    private int studentId;
    private int courseId;
    private Timestamp enrollmentDate;
    private Timestamp startDate;
    private Timestamp endDate;
    private double fees;
    private double discount;

    public Enrollment() {
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Timestamp getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Timestamp enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Enrollment{" + "enrollmentId=" + enrollmentId + ", studentId=" + studentId + ", courseId=" + courseId + ", enrollmentDate=" + enrollmentDate + ", startDate=" + startDate + ", endDate=" + endDate + ", fees=" + fees + ", discount=" + discount + '}';
    }
    
    
    
}
