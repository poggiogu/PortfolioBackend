package com.Portfolio.portfolioBackend.model.service;

import com.Portfolio.portfolioBackend.modelo.Skill;
import java.util.List;


public interface ISkillService {
    
    public void crearSkill(Skill skill);
    
    public void editarSkill(Skill skill);
    
    public List<Skill> traerSkills();
    
    public Skill traerSkill(Long id);
    
    public void borrarSkill(Long id);
    
}
