package com.microservicetwo.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.sql.Time;

@Entity
@Table(name = "restaurante")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mi_secuencia_generator")
    @SequenceGenerator(name = "mi_secuencia_generator", sequenceName = "mi_secuencia", allocationSize = 1)
    private Long id;

    @NonNull
    @Column(name = "nome_restaurante")
    private String nomeRestaurante;

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
}
