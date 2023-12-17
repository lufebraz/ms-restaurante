package com.microservicetwo.respository;

import com.microservicetwo.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

    Restaurante findByNomeRestaurante(String nomeRestaurante);
}
