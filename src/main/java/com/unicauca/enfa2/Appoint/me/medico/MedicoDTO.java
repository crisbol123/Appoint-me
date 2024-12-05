package com.unicauca.enfa2.Appoint.me.medico;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MedicoDTO {
    private Long id;
    private String nombre;
    private String identificacion;
    private String correo;
    private Long especialidad;
}
