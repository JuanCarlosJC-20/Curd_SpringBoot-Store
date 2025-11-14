package com.sena.crud_basic.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "product")
public class ProductDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int id;

    @Column(name="name",nullable = false,length = 100)
    private String name;

    @Column(name="description",nullable = true,length = 500)
    private String description;

    @Column(name="price",nullable = false)
    private double price;

    @Column(name="stock",nullable = false)
    private int stock;

    @Column(name="sku",nullable = false,length = 100)
    private String sku;

    @Column(name="is_active",nullable = false)
    private boolean isActive;

    @Column(name="created_at",nullable = false,length = 50)
    private Date createdAt;
    
    @Column(name="updated_at",nullable = true,length = 50)
    private Date updatedAt;

}
