package com.example.demo.config;

import com.example.demo.dto.*;
import com.example.demo.entity.Bird;
import com.example.demo.entity.Cat;
import com.example.demo.entity.Dog;
import com.example.demo.entity.Fish;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapper {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(Bird.class, AnimalDTO.class).setProvider(req -> modelMapper.map(req.getSource(), BirdDTO.class));
        modelMapper.typeMap(Cat.class, AnimalDTO.class).setProvider(req -> modelMapper.map(req.getSource(), CatDTO.class));
        modelMapper.typeMap(Dog.class, AnimalDTO.class).setProvider(req -> modelMapper.map(req.getSource(), DogDTO.class));
        modelMapper.typeMap(Fish.class, AnimalDTO.class).setProvider(req -> modelMapper.map(req.getSource(), FishDTO.class));
        return modelMapper;
    }
}
