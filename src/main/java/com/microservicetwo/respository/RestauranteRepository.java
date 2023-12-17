package com.microservicetwo.respository;

import com.microservicetwo.model.Restaurante;
import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

    @Query(value = "SELECT * FROM RESTAURANTE R WHERE UPPER(R.nome_restaurante) like UPPER(:nomeRestaurante)", nativeQuery = true)
    Restaurante findByNomeRestaurante(@PathParam("nomeRestaurante") String nomeRestaurante);
}
