package com.desarrollo.spring.complexivo.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "categories")
public class Category {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    //relacion
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
