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
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;

    private String tituloExp;
    private String empresaExp;
    private String fechaIniExp;
    private String fechaFinExp;
    private String descripcionExp;
    private String imgExp;
}
