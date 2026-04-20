package com.empresa.envios.repository;

import com.empresa.envios.model.TarifaEnvio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TarifaEnvioRepository extends JpaRepository<TarifaEnvio, Integer> {
    Optional<TarifaEnvio> findByPais(String pais);
}