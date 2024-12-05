package com.unicauca.enfa2.Appoint.me.fecha;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FechaDisponibleDTO {
    private Long idMedico;
    private String fecha;
    private String hora;
}
