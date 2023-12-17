package com.microservicetwo.service;

import com.microservicetwo.model.Restaurante;
import com.microservicetwo.model.RestauranteRequest;
import com.microservicetwo.respository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public ResponseEntity<Object> findRestaurante(RestauranteRequest request) {
        Restaurante restaurante = restauranteRepository.findByNomeRestaurante(request.getNomeRestaurante());
        if (restaurante != null) {
            return ResponseEntity.ok().body(restaurante);
        }
        return ResponseEntity.badRequest().body("Restaurante não encontrado.");
    }

    public ResponseEntity<Object> create(Restaurante restaurante) {
        return ResponseEntity.ok().body(restauranteRepository.save(restaurante));
    }
}
