package com.Portfolio.portfolioBackend.model.service;


import com.Portfolio.portfolioBackend.modelo.Perfil;
import java.util.List;

public interface IPerfilService {

    public void crearPerfil(Perfil perfil);
    
    public void editarPerfil(Perfil perfil);
    
    public List<Perfil> traerPerfiles();
    
    public Perfil traerPerfil(Long id);
    
    public void borrarPerfil(Long id);
    
}
