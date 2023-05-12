package com.Portfolio.portfolioBackend.repository;

import com.Portfolio.portfolioBackend.modelo.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>{
    
}
