package com.example.demo.config;

import com.example.demo.dto.AnimalDTO;
import com.example.demo.dto.FishDTO;
import com.example.demo.entity.Fish;
import com.github.jmnarloch.spring.boot.modelmapper.ModelMapperConfigurer;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FishDTOMapper implements ModelMapperConfigurer {

    @Override
    public void configure(ModelMapper modelMapper) {
        modelMapper.typeMap(Fish.class, AnimalDTO.class).setProvider(req -> modelMapper.map(req.getSource(), FishDTO.class));
    }
}
