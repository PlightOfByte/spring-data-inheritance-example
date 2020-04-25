package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("Cat")
public class CatDTO extends AnimalDTO {

    private Integer numberOfLimbs;
}
