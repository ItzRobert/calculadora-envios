package com.empresa.envios.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tarifas_envio")
public class TarifaEnvio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String pais;

    @Column(nullable = false)
    private Double tarifa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
}