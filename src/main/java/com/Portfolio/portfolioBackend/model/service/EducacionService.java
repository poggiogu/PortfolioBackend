package com.Portfolio.portfolioBackend.model.service;

import com.Portfolio.portfolioBackend.modelo.Educacion;
import com.Portfolio.portfolioBackend.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void editarEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public List<Educacion> traerEducaciones() {
        return eduRepo.findAll();
    }

    @Override
    public Educacion traerEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }
    
}
