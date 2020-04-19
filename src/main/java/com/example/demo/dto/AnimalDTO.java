package com.example.demo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AnimalDTO implements Serializable {
    private Long id;
    private String name;
}
