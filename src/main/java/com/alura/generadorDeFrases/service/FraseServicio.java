package com.alura.generadorDeFrases.service;

import com.alura.generadorDeFrases.dto.FraseDTO;
import com.alura.generadorDeFrases.model.Frase;
import com.alura.generadorDeFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseServicio {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
