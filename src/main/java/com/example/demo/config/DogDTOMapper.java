package com.example.demo.config;

import com.example.demo.dto.AnimalDTO;
import com.example.demo.dto.DogDTO;
import com.example.demo.entity.Dog;
import com.github.jmnarloch.spring.boot.modelmapper.ModelMapperConfigurer;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogDTOMapper implements ModelMapperConfigurer {

    @Override
    public void configure(ModelMapper modelMapper) {
        modelMapper.typeMap(Dog.class, AnimalDTO.class).setProvider(req -> modelMapper.map(req.getSource(), DogDTO.class));
    }
}
