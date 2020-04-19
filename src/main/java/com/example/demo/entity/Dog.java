package com.example.demo.entity;

import com.example.demo.dto.AnimalDTO;
import com.example.demo.dto.DogDTO;
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

    @Override
    public Class<? extends AnimalDTO> getDtoClass() {
        return DogDTO.class;
    }
}
