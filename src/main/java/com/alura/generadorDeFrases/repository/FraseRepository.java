package com.alura.generadorDeFrases.repository;

import com.alura.generadorDeFrases.dto.FraseDTO;
import com.alura.generadorDeFrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();
}
