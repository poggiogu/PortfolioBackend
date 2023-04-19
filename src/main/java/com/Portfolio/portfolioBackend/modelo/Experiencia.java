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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_exp;
    @Basic
    private String nombre;
    private String puesto;
    private String periodo;
    private String url_logo;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(Long id_exp, String nombre, String puesto, String periodo, String url_logo, String descripcion) {
        this.id_exp = id_exp;
        this.nombre = nombre;
        this.puesto = puesto;
        this.periodo = periodo;
        this.url_logo = url_logo;
        this.descripcion = descripcion;
    }
    
}
