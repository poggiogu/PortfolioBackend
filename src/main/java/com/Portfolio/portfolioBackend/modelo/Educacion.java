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
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_educacion;
    @Basic
    private String nombre_edu;
    private String tipo_formato;
    private String fecha_finalizacion;
    private String descripcion;
    private String url_logo_institucion;
    private String url_certificacion;

    public Educacion() {
    }

    public Educacion(Long id_educacion, String nombre_edu, String tipo_formato, String fecha_finalizacion, String descripcion, String url_logo_institucion, String url_certificacion) {
        this.id_educacion = id_educacion;
        this.nombre_edu = nombre_edu;
        this.tipo_formato = tipo_formato;
        this.fecha_finalizacion = fecha_finalizacion;
        this.descripcion = descripcion;
        this.url_logo_institucion = url_logo_institucion;
        this.url_certificacion = url_certificacion;
    }
    
}
