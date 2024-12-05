package com.unicauca.enfa2.Appoint.me.fecha;

import com.unicauca.enfa2.Appoint.me.medico.Medico;
import com.unicauca.enfa2.Appoint.me.medico.MedicoEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class FechaDisponibleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fecha;

    @Column(nullable = false)
    private String hora;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id", nullable = false )
    private MedicoEntity medico;
}