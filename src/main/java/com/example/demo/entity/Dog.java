package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("Dog")
public class Dog extends Animal {

    @Column(name = "ATTRIBUTE_1")
    private Integer numberOfLimbs;

}
