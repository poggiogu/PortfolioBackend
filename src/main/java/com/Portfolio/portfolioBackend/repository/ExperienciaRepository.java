package com.Portfolio.portfolioBackend.repository;

import com.Portfolio.portfolioBackend.modelo.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
}
