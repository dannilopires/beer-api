package com.beerstock.Beerapi.repository;

import com.beerstock.Beerapi.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/*
Interface que implementa o padrao arquitetural DAO (Data Access Object). Responsavel por fazer
a ligaçao com o banco de dados
 */

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
