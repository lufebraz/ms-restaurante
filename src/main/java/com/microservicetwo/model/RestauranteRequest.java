package com.microservicetwo.model;

import org.springframework.lang.NonNull;

public class RestauranteRequest {
    @NonNull
    private String nomeRestaurante;

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }
}
