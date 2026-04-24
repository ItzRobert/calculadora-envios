package com.empresa.envios.infrastructure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.envios.domain.model.TarifaEnvio;

public interface TarifaEnvioRepository extends JpaRepository<TarifaEnvio, Integer> {
    Optional<TarifaEnvio> findByPais(String pais);
}