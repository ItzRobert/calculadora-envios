package com.empresa.envios.service;

import com.empresa.envios.model.TarifaEnvio;
import com.empresa.envios.repository.TarifaEnvioRepository;
import org.springframework.stereotype.Service;

@Service
public class TarifaEnvioService {

    private final TarifaEnvioRepository tarifaEnvioRepository;

    public TarifaEnvioService(TarifaEnvioRepository tarifaEnvioRepository) {
        this.tarifaEnvioRepository = tarifaEnvioRepository;
    }

    public void validarDatos(Double peso, String pais) {
        if (peso == null) {
            throw new IllegalArgumentException("Debe ingresar el peso.");
        }

        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que 0.");
        }

        if (pais == null || pais.isBlank()) {
            throw new IllegalArgumentException("Debe seleccionar un país.");
        }
    }

    public double obtenerTarifa(String pais) {
        TarifaEnvio tarifaEnvio = tarifaEnvioRepository.findByPais(pais.toUpperCase())
                .orElseThrow(() -> new IllegalArgumentException("País inválido."));

        return tarifaEnvio.getTarifa();
    }

    public double calcularCosto(double peso, String pais) {
        double tarifa = obtenerTarifa(pais);
        return peso * tarifa;
    }
}
