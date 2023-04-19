package com.Portfolio.portfolioBackend.model.service;

import com.Portfolio.portfolioBackend.modelo.Proyecto;
import com.Portfolio.portfolioBackend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyeRepo;
    
    @Override
    public void crearProyecto(Proyecto proy) {
        proyeRepo.save(proy);
    }

    @Override
    public void editarProyecto(Proyecto proy) {
        proyeRepo.save(proy);
    }

    @Override
    public List<Proyecto> traerProyectos() {
        return proyeRepo.findAll();
    }

    @Override
    public Proyecto traerProyecto(Long id) {
        return proyeRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }
    
}
