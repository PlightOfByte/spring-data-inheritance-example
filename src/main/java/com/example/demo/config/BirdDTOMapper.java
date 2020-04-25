package com.example.demo.config;

import com.example.demo.dto.AnimalDTO;
import com.example.demo.dto.BirdDTO;
import com.example.demo.entity.Bird;
import com.github.jmnarloch.spring.boot.modelmapper.ModelMapperConfigurer;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BirdDTOMapper implements ModelMapperConfigurer {

    @Override
    public void configure(ModelMapper modelMapper) {
        modelMapper.typeMap(Bird.class, AnimalDTO.class).setProvider(req -> modelMapper.map(req.getSource(), BirdDTO.class));
    }
}
