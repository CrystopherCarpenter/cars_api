package com.carsapi.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarsDTO;

@RestController
@RequestMapping("/cars")
public class CarsController {
    @PostMapping
    public void create(@RequestBody CarsDTO req) {
        System.out.println(req.modelo());
        System.out.println(req.valor());
        System.out.println(req.anoModelo());

    }
}
