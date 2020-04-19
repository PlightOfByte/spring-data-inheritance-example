package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("Bird")
public class BirdDTO extends AnimalDTO {

    private Integer numberOfWings;
}
