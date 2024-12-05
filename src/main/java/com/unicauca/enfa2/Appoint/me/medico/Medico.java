package com.unicauca.enfa2.Appoint.me.medico;

import com.unicauca.enfa2.Appoint.me.fecha.FechaDisponibleEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Medico {
    private Long id;
    private String nombre;
    private String identificacion;
    private String correo;
    private Long especialidad;

}
