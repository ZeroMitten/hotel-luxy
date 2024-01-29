package com.admin.HotelLuxy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hotel")
@CrossOrigin(origins = "http://localhost:8081")
public class HotelController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to our Hotel API!";
    }

    // Puedes agregar más endpoints aquí para manejar otras operaciones.
}
