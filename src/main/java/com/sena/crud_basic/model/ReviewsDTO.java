package com.sena.crud_basic.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "reviews")
public class ReviewsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_review")
    private int id;

    @Column(name="rating",nullable = false)
    private int rating;

    @Column(name="title",nullable = false,length = 100)
    private String title;

    @Column(name="comment",nullable = true,length = 500)
    private String comment;

    @Column(name="is_verified_purchase",nullable = false)
    private boolean isVerifiedPurchase;

    @Column(name="created_at",nullable = false,length = 50)
    private Date createdAt;

    @Column(name="updated_at",nullable = true,length = 50)
    private Date updatedAt;
}
