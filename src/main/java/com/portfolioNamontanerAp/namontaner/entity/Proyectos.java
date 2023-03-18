package com.portfolioNamontanerAp.namontaner.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyecto;
    private String nombreProyecto;
    private String fechaProyecto;
    private String descripcionProyecto;
    private String imgProyecto;
    private String urlProyecto;
}
