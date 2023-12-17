package com.microservicetwo.controller;

import com.microservicetwo.model.Restaurante;
import com.microservicetwo.model.RestauranteRequest;
import com.microservicetwo.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/restaurante")
public class MainController {

    @Autowired
    private RestauranteService restauranteService;

    @PostMapping("/find-by-name")
    public ResponseEntity<Object> findRestaurante(@RequestBody RestauranteRequest request) {
        return restauranteService.findRestaurante(request);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createRestaurante(@RequestBody Restaurante restaurante) {
        return restauranteService.create(restaurante);
    }
}
