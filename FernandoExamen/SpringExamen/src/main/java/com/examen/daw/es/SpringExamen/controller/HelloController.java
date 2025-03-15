package com.examen.daw.es.SpringExamen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")

public class HelloController {
    @GetMapping("/hello")
        public String sayHello(){
            return "¡Hola Mundo desde spring boot y Docker!";
        }
    
    @PutMapping("/actualizarHello/{id}")
    public String actualizarHello(@PathVariable String id, @RequestBody String data) {
        return "Actualizando el recurso con ID: " + id + " con los datos: " + data;
    }

    @PostMapping("/crearHello")
    public String crearHello(@RequestBody String data) {
        return "Recurso creado con los datos: " + data;
    }

}


// imagen del docker ps
// usuario de github