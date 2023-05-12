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
public class Skill {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String titulo;
    private String color;
    private String porcentaje;
    private String imagen;
    
    //contructores:
    public Skill() {
    }

    public Skill(Long id, String titulo, String color, String porcentaje, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.color = color;
        this.porcentaje = porcentaje;
        this.imagen = imagen;
    }
    
}
