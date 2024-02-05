package com.SaudaInsights.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product
{   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("productid")
    private int productId;
    @JsonProperty("productname")
    private String productName;
    @JsonProperty("imageurl")
    private String imageUrl;
}
