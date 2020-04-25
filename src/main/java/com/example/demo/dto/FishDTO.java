package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("Fish")
public class FishDTO extends AnimalDTO {

    private Integer numberOfFins;
}
