package com.example.demo.entity;

import com.example.demo.dto.AnimalDTO;
import com.example.demo.dto.BirdDTO;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("Bird")
public class Bird extends Animal {

    @Column(name = "ATTRIBUTE_1")
    private Integer numberOfWings;

    @Override
    public Class<? extends AnimalDTO> getDtoClass() {
        return BirdDTO.class;
    }
}
