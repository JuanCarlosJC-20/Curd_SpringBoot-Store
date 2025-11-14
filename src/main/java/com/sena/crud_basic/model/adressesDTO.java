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
@Entity(name="addresses")
public class adressesDTO {

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
    @Column(name = "id_address")
    private int id_address;
    
    @Column(name="street",nullable = false,length = 50)
    private String street;

    @Column(name="address_type",nullable = false,length = 20)
    private String addressType;

    @Column(name="street_address",nullable = false,length = 250)
    private String streetAddress;

    @Column(name="city",nullable = false,length = 50)
    private String city;

    @Column(name="state",nullable = false,length = 50)
    private String state;

    @Column(name="postal_code",nullable = false,length = 20)
    private String postalCode;

    @Column(name="country",nullable = false,length = 50)
    private String country;

    @Column(name="created_at",nullable = false,length = 50)
    private Date createdAt;
    
    @Column(name="updated_at",nullable = true,length = 50)
    private Date updatedAt;

    

}
