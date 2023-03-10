package com.example.StaticFilterDemo;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    Service service;

    @GetMapping("/getPerson")
    public Person getPerson(){
        return service.getPerson();
    }

    @GetMapping("/getAddress")
    public Address getAddress(){
        return service.getAddress();
    }
}
