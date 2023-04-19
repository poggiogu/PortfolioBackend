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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_project;
    @Basic
    private String nombre_project;
    private String url_project;
    private String descripcion;

    public Proyecto() {
    }

    public Proyecto(Long id_project, String nombre_project, String url_project, String descripcion) {
        this.id_project = id_project;
        this.nombre_project = nombre_project;
        this.url_project = url_project;
        this.descripcion = descripcion;
    }
    
}