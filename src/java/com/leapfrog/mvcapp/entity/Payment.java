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
   private int paymentId;
   private int enrollmentId;
   private Double amount;
   private Timestamp paymentDate;

    public Payment() {
    }

    public int getPayementId() {
        return paymentId;
    }

    public void setPayementId(int payementId) {
        this.paymentId = payementId;
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
        return paymentDate;
    }

    public void setPayementDate(Timestamp payementDate) {
        this.paymentDate = payementDate;
    }

    @Override
    public String toString() {
        return "Payment{" + "payementId=" + paymentId + ", enrollmentId=" + enrollmentId + ", amount=" + amount + ", payementDate=" + paymentDate + '}';
    }
   
   
    
    
    
    
    
}
