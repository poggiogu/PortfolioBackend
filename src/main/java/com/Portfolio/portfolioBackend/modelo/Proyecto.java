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
    private String nombre;
    private String descripcion;
    private String fecha;
    private String urlImagen;
    private String urlRepositorio;

    public Proyecto() {
    }

    public Proyecto(Long id_project, String nombre, String descripcion, String fecha, String urlImagen, String urlRepositorio) {
        this.id_project = id_project;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.urlImagen = urlImagen;
        this.urlRepositorio = urlRepositorio;
    }
    
}