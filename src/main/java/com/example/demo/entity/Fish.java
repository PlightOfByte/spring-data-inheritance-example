package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("Fish")
public class Fish extends Animal {

    @Column(name = "ATTRIBUTE_1")
    private Integer numberOfFins;

}
