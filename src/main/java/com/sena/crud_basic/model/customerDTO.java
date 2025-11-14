package com.sena.crud_basic.model;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * Para indicar que la clase es un modelo, se utiliza
 * la anotación bean @Entity
 * name=El nombre de la entidad en la base datos
 */
@Entity(name = "customer")
public class customerDTO {
    /*
     * DTO= Data Transfer Object
     * las clases DTO contienen las entidades de la base
     * de datos
     */
    //id=PRIMARY KEY
    //GeneratedValue=Auto incremental
    //@Column=para indicar que el atributo es una columna
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_customer;

    @Column(name="first_name",nullable = false,length = 100)
    private String first_name;

    @Column(name="last_name",nullable = false,length = 100)
    private String last_name;

    @Column(name="email",nullable = false,length = 150)
    private String email;

    @Column(name="phone",nullable = false,length = 20)
    private String phone;

    @Column(name="password",nullable = false,length = 200)
    private String password;

    @Column(name="date_of_birth",nullable = true,length = 50)
    private Date date_of_birth;

    @Column(name="created_at",nullable = false,length = 50)
    private Date created_at;

    @Column(name="updated_at",nullable = true,length = 50)
    private Date updated_at;

// agregar la n cantidad de columnas

    


}
