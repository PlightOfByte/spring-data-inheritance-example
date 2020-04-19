package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
public class AnimalDTO implements Serializable {
    private Long id;
    private String name;
}
