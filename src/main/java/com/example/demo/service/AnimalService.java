package com.example.demo.service;

import com.example.demo.dto.AnimalDTO;
import com.example.demo.repository.AnimalRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<AnimalDTO> getAllAnimals() {
        return StreamSupport.stream(animalRepository.findAll().spliterator(), false)
                .map(animal -> modelMapper.map(animal, animal.getDtoClass(), "MyCustomMapper"))
                .collect(Collectors.toList());
    }
}
