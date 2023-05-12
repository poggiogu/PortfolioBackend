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
public class Educacion {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_educacion;
    @Basic
    private String title;
    private String course;
    private String descripcion;
    private String year;
    private String instLogoUrl;
    private String certificadoUrl;

    //constructores
    public Educacion() {
    }

    public Educacion(Long id_educacion, String title, String course, String descripcion, String year, String instLogoUrl, String certificadoUrl) {
        this.id_educacion = id_educacion;
        this.title = title;
        this.course = course;
        this.descripcion = descripcion;
        this.year = year;
        this.instLogoUrl = instLogoUrl;
        this.certificadoUrl = certificadoUrl;
    }
    
    
    
    
}
