package com.unicauca.enfa2.Appoint.me.fecha;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FechaRepository extends JpaRepository<FechaDisponibleEntity, Long> {
}
