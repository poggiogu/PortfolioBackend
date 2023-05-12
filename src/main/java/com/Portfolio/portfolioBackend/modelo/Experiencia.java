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
    
    //atributos:
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_exp;
    @Basic
    private String text;
    private String cargo;
    private String descripcion;
    private String dates;
    private String brandLogoUrl;

    //constructores:
    public Experiencia() {
    }

    public Experiencia(Long id_exp, String text, String cargo, String descripcion, String dates, String brandLogoUrl) {
        this.id_exp = id_exp;
        this.text = text;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.dates = dates;
        this.brandLogoUrl = brandLogoUrl;
    }
    
    
    
    
}
