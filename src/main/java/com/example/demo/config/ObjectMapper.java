package com.example.demo.config;

import com.example.demo.dto.BirdDTO;
import com.example.demo.dto.CatDTO;
import com.example.demo.dto.DogDTO;
import com.example.demo.dto.FishDTO;
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
        modelMapper.typeMap(Bird.class, BirdDTO.class, "MyCustomMapper").addMapping(Bird::getName, BirdDTO::setAbcxy);
        modelMapper.typeMap(Cat.class, CatDTO.class, "MyCustomMapper").addMapping(Cat::getName, CatDTO::setYuiqwe);
        modelMapper.typeMap(Dog.class, DogDTO.class, "MyCustomMapper").addMapping(Dog::getName, DogDTO::setZnmxc);
        modelMapper.typeMap(Fish.class, FishDTO.class, "MyCustomMapper").addMapping(Fish::getName, FishDTO::setIoioqwe);
        return modelMapper;
    }
}
