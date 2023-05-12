package com.Portfolio.portfolioBackend.repository;

import com.Portfolio.portfolioBackend.modelo.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{
    
}
