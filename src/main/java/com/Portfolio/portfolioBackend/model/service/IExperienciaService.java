package com.Portfolio.portfolioBackend.model.service;

import com.Portfolio.portfolioBackend.modelo.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public void crearExperiencia(Experiencia exp);
    
    public void editarExperiencia(Experiencia exp);
    
    public List<Experiencia> traerExperiencias();
    
    public Experiencia traerExperiencia(Long id);
    
    public void borrarExperiencia(Long id);
    
}
