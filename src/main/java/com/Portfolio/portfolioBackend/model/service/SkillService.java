package com.Portfolio.portfolioBackend.model.service;

import com.Portfolio.portfolioBackend.modelo.Skill;
import com.Portfolio.portfolioBackend.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillService implements ISkillService{
    
    @Autowired
    public SkillRepository skillRepo;

    @Override
    public void crearSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void editarSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public List<Skill> traerSkills() {
        return skillRepo.findAll();
    }

    @Override
    public Skill traerSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }
    
}
