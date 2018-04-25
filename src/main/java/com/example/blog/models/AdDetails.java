package com.example.blog.models;

import javax.persistence.*;


@Entity
@Table(name = "ad_details")
public class AdDetails {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String location;

//    public AdDetails(double )



}