package com.Portfolio.portfolioBackend.model.service;

import com.Portfolio.portfolioBackend.modelo.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public void crearProyecto(Proyecto proy);
    
    public void editarProyecto(Proyecto proy);
    
    public List<Proyecto> traerProyectos();
    
    public Proyecto traerProyecto(Long id);
    
    public void borrarProyecto(Long id);
    
}
