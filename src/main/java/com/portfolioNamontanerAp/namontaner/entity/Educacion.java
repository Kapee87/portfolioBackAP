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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private String institucionEdu;
    private String fechaIniEdu;
    private String fechaFinEdu;
    private String descripcionEdu;
    private String imgEdu;

}
