package com.portfolioNamontanerAp.namontaner.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String fecha_nac;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String telefono;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String correo;

    @NotNull
    @Size(min = 1, max = 2000, message = "no cumple con la longitud")
    private String descripcion;

    @Size(max = 2000, message = "no cumple con la longitud")
    private String url_foto;

    /*
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educationList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skills> skillsList;
     */
}
