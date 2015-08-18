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
public class Payment {
   private int payementId;
   private int enrollmentId;
   private Double amount;
   private Timestamp payementDate;

    public Payment() {
    }

    public int getPayementId() {
        return payementId;
    }

    public void setPayementId(int payementId) {
        this.payementId = payementId;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Timestamp getPayementDate() {
        return payementDate;
    }

    public void setPayementDate(Timestamp payementDate) {
        this.payementDate = payementDate;
    }

    @Override
    public String toString() {
        return "Payment{" + "payementId=" + payementId + ", enrollmentId=" + enrollmentId + ", amount=" + amount + ", payementDate=" + payementDate + '}';
    }
   
   
    
    
    
    
    
}
