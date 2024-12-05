package com.unicauca.enfa2.Appoint.me.fecha;

import com.unicauca.enfa2.Appoint.me.medico.Medico;
import com.unicauca.enfa2.Appoint.me.medico.MedicoEntity;
import com.unicauca.enfa2.Appoint.me.medico.MedicoRepository;
import com.unicauca.enfa2.Appoint.me.medico.MedicoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class FechaService {
    private final MedicoRepository medicoRepository;
    private final FechaRepository fechaRepository;
    public void guardar(FechaDisponibleDTO fechaDisponibleDTO) {
    if(medicoRepository.findById(fechaDisponibleDTO.getIdMedico()).isPresent()){
        MedicoEntity medico = medicoRepository.findById(fechaDisponibleDTO.getIdMedico()).get();
        FechaDisponibleEntity fechaDisponibleEntity = new FechaDisponibleEntity();
        fechaDisponibleEntity.setFecha(fechaDisponibleDTO.getFecha());
        fechaDisponibleEntity.setHora(fechaDisponibleDTO.getHora());
        fechaDisponibleEntity.setMedico(medico);
        medico.getFechasDisponibles().add(fechaDisponibleEntity);
        medicoRepository.save(medico);
    }else {
        throw new RuntimeException("Medico no encontrado");
    }
}
    public List<FechaDTO> listar(Long idMedico) {

        if(medicoRepository.findById(idMedico).isPresent()){
            MedicoEntity medico = medicoRepository.findById(idMedico).get();
            List<FechaDTO> fechas = new ArrayList<>();
            medico.getFechasDisponibles().forEach(fecha -> {
                fechas.add(new FechaDTO(fecha.getId(), fecha.getFecha(), fecha.getHora()));
            });
            return fechas;
        }else {
            throw new RuntimeException("Medico no encontrado");
        }
    }
     public void eliminar(Long id) {
        if(fechaRepository.findById(id).isPresent()){
            fechaRepository.deleteById(id);
        }else {
            throw new RuntimeException("Fecha no encontrada");
        }
}
}
