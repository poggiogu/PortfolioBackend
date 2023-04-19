package com.Portfolio.portfolioBackend.model.service;

import com.Portfolio.portfolioBackend.modelo.Experiencia;
import com.Portfolio.portfolioBackend.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void editarExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public List<Experiencia> traerExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public Experiencia traerExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }
    
}
