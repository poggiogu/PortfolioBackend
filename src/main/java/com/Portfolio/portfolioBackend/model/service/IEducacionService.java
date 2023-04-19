package com.Portfolio.portfolioBackend.model.service;

import com.Portfolio.portfolioBackend.modelo.Educacion;
import java.util.List;


public interface IEducacionService {

    public void crearEducacion(Educacion edu );
    
    public void editarEducacion(Educacion edu);
    
    public List<Educacion> traerEducaciones();
    
    public Educacion traerEducacion(Long id);
    
    public void borrarEducacion(Long id);
    
}
