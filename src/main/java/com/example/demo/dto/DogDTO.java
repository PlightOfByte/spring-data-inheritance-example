package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("Dog")
public class DogDTO extends AnimalDTO {

    private Integer numberOfLimbs;

    private String znmxc;
}
