package com.Portfolio.portfolioBackend.repository;

import com.Portfolio.portfolioBackend.modelo.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
    
}
