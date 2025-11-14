package com.sena.crud_basic.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "orders")
public class OrdersDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private int id;

    @Column(name="order_number",nullable = false,length = 50)
    private String orderNumber;

    @Column(name="stuatus",nullable = false,length = 20)
    private String status;

    @Column(name="subtotal",nullable = false)
    private double subtotal;

    @Column(name="tax",nullable = false)
    private double tax;

    @Column(name="shipping_cost",nullable = false)
    private double shippingCost;

    @Column(name="total",nullable = false)
    private double total;

    @Column(name = "created_at", nullable = false, length = 50)
    private Date createdAt;

    @Column(name = "updated_at", nullable = true, length = 50)
    private Date updatedAt;
}
