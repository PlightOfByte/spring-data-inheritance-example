package com.example.demo.controller;

import com.example.demo.dto.AnimalDTO;
import com.example.demo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("animals")
    public List<AnimalDTO> getAllAnimals() {
        return animalService.getAllAnimals();
    }
}
