package com.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/app")
public class HolaMundoController {

    @GetMapping("/hola")

    public String holaMundo(){
        return "¡HOLA MUNDO!";
    }
    @GetMapping("/saludo")

    public String holaSaludo(){
        return "Hola a todos, mi nombre es pedro";
    }

    @GetMapping("/saludo/{nombre_usuario}")

    public String saludo(@PathVariable String nombre_usuario){
        return "¡HOLA !" + nombre_usuario ;
    }
    @GetMapping("/suma/{valor_uno}/{valor_dos}")

    public String suma(@PathVariable Integer valor_uno,@PathVariable Integer valor_dos ){
         return String.valueOf(valor_uno + valor_dos) ;
    }
    @GetMapping("/rest/{valor_uno}/{valor_dos}")

    public String rest(@PathVariable Integer valor_uno,@PathVariable Integer valor_dos ){
        return String.valueOf(valor_uno - valor_dos) ;
    }
    @GetMapping("/div/{valor_uno}/{valor_dos}")

    public String div(@PathVariable Integer valor_uno,@PathVariable Integer valor_dos ){

        try {
            return String.valueOf(valor_uno / valor_dos);
        } catch (ArithmeticException e) {
            return "Error: " + e.getMessage();
        }
    }
    @GetMapping("/multi/{valor_uno}/{valor_dos}")

    public String multi(@PathVariable Integer valor_uno,@PathVariable Integer valor_dos ){
        return String.valueOf(valor_uno * valor_dos) ;
    }

}
