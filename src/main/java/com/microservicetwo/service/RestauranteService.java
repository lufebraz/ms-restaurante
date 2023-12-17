package com.microservicetwo.service;

import com.microservicetwo.model.Restaurante;
import com.microservicetwo.model.RestauranteRequest;
import com.microservicetwo.respository.RestauranteRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;


    @CircuitBreaker(name = "myCircuitBreaker", fallbackMethod = "fallbackMethod()")
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

    public ResponseEntity<String> fallbackMethod() {
        return ResponseEntity.internalServerError().body("Servico fora do ar");
    }

    public ResponseEntity<Object> findRestauranteById(Long id) {
        Optional<Restaurante> byId = restauranteRepository.findById(id);
        if (byId.isPresent()) {
            return ResponseEntity.ok().body(byId.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Object> deleteRestaurante(Long id) {
        Optional<Restaurante> byId = restauranteRepository.findById(id);
        if (byId.isPresent()) {
            restauranteRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
