package br.com.rafael.floriano.spring_with_swagger_implementation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plant")
public class PlantController {


    @GetMapping("/show/plant")
    public void showMyPlant() {

    }

}
