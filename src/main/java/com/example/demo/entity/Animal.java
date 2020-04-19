package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "ANIMAL")
public class Animal implements Serializable {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;
}
