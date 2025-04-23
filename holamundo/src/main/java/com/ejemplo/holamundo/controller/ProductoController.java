package com.ejemplo.holamundo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/producto")

public class ProductoController {
    @GetMapping
    public String index() {
        return "Bienvenido a la lista de productos";
    }
    @GetMapping
    public String holamundo(){
        return "hola mundo desde la lista de productos";
    }

}
