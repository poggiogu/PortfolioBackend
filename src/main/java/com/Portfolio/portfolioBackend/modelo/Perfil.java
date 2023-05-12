package com.Portfolio.portfolioBackend.modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Perfil {
    
    //atributos:
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String titulo;
    private String acercaDeMi;
    private String urlImagenPerfil;
    private String urlImagenBanner;
    
    //constructores:
    public Perfil() {
    }

    public Perfil(Long id, String nombre, String titulo, String acercaDeMi, String urlImagenPerfil, String urlImagenBanner) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.acercaDeMi = acercaDeMi;
        this.urlImagenPerfil = urlImagenPerfil;
        this.urlImagenBanner = urlImagenBanner;
    }
    
    
}
