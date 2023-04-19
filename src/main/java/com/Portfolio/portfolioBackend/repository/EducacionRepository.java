package com.Portfolio.portfolioBackend.repository;

import com.Portfolio.portfolioBackend.modelo.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long>{
    
}