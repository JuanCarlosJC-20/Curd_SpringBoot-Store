package com.sena.crud_basic.model;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "suppliers")
public class SuppliersDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_supplier")
    private int id;

    @Column(name="name",nullable = false,length = 100)
    private String name;

    @Column(name="contact_name",nullable = false,length = 100)
    private String contactName;

    @Column(name="email",nullable = false,length = 100)
    private String email;

    @Column(name="phone",nullable = true,length = 20)
    private String phone;

    @Column(name="address",nullable = true,length = 200)
    private String address;

    @Column(name="city",nullable = true,length = 50)
    private String city;

    @Column(name="country",nullable = true,length = 50)
    private String country;

    @Column(name="created_at",nullable = false,length = 50)
    private Date createdAt;
    @Column(name="updated_at",nullable = true,length = 50)
    private Date updatedAt;
}
