package br.com.rafael.floriano.spring_with_swagger_implementation.controller;

import br.com.rafael.floriano.spring_with_swagger_implementation.model.Plant;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plant")

public class PlantController {


    @GetMapping("/show/plant/{plantId}")
    @ResponseStatus(HttpStatus.OK)
    public Plant showMyPlant(@PathVariable("plantId") Long plantId) {
        return new Plant("GIRASSOL");
    }

}
