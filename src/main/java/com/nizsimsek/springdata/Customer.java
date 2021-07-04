package com.nizsimsek.springdata;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private int age;
    private String name;

    public Customer() {
    }

    public Customer(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
