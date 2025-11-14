package com.sena.crud_basic.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "brands")
public class BrandsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_brand")
    private int id;

    @Column(name="name",nullable = false,length = 100)
    private String name;

    @Column(name="description",nullable = true,length = 500)
    private String description;

    @Column(name="logo_url",nullable = true,length = 250)
    private String logoUrl;

    @Column(name="website_url",nullable = true,length = 250)
    private String websiteUrl;

    @Column(name="is_active",nullable = false  )
    private boolean isActive;

    @Column(name="created_at",nullable = false,length = 50)
    private Date createdAt;

    @Column(name="updated_at",nullable = true,length = 50)
    private Date updatedAt;

}
