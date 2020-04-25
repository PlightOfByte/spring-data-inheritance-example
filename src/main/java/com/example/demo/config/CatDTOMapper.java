package com.example.demo.config;

import com.example.demo.dto.AnimalDTO;
import com.example.demo.dto.CatDTO;
import com.example.demo.entity.Cat;
import com.github.jmnarloch.spring.boot.modelmapper.ModelMapperConfigurer;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatDTOMapper implements ModelMapperConfigurer {

    @Override
    public void configure(ModelMapper modelMapper) {
        modelMapper.typeMap(Cat.class, AnimalDTO.class).setProvider(req -> modelMapper.map(req.getSource(), CatDTO.class));
    }
}
