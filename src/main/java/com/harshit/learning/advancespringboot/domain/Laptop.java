package com.harshit.learning.advancespringboot.domain;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "laptop")
public class Laptop {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;

    private String name;
    private String company;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
