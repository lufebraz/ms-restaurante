package com.microservicetwo.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.sql.Time;

@Entity
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mi_secuencia_generator")
    @SequenceGenerator(name = "mi_secuencia_generator", sequenceName = "mi_secuencia", allocationSize = 1)
    private Long id;

    @NonNull
    private String nomeRestaurante;

    @NonNull
    private String horarioAberto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getHorarioAberto() {
        return horarioAberto;
    }

    public void setHorarioAberto(String horarioAberto) {
        this.horarioAberto = horarioAberto;
    }
}
