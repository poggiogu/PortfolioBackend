package com.Portfolio.portfolioBackend.model.service;

import com.Portfolio.portfolioBackend.modelo.Perfil;
import com.Portfolio.portfolioBackend.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PerfilService implements IPerfilService{
    
    @Autowired
    public PerfilRepository perfilRepo;

    @Override
    public void crearPerfil(Perfil perfil) {
        perfilRepo.save(perfil);
    }

    @Override
    public void editarPerfil(Perfil perfil) {
        perfilRepo.save(perfil);
    }

    @Override
    public List<Perfil> traerPerfiles() {
        return perfilRepo.findAll();
    }

    @Override
    public Perfil traerPerfil(Long id) {
        return perfilRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarPerfil(Long id) {
        perfilRepo.deleteById(id);
    }
    
}