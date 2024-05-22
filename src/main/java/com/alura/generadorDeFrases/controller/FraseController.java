package com.alura.generadorDeFrases.controller;

import com.alura.generadorDeFrases.dto.FraseDTO;
import com.alura.generadorDeFrases.service.FraseServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseServicio servicio;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
