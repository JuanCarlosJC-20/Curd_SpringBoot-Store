package com.sena.crud_basic.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "payments")
public class PaymentsDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment")
    private int id;

    @Column(name="payment_method",nullable = false,length = 50)
    private String paymentMethod;

    @Column(name="amount",nullable = false)
    private double amount;

    @Column(name="status",nullable = false,length = 20)
    private String status;

    @Column(name="payment_date",nullable = false,length = 50)
    private Date paymentDate;
 
    @Column(name="created_at",nullable = false,length = 50)
    private Date createdAt;
    
    @Column(name="updated_at",nullable = true,length = 50)
    private Date updatedAt;
    

}
