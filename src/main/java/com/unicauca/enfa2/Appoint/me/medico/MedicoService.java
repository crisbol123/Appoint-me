package com.unicauca.enfa2.Appoint.me.medico;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Getter
@Setter
public class MedicoService {
        private final MedicoRepository medicoRepository;
private final EspecialidadRepository especialidadRepository;
        public List<MedicoDTO> listar(int especialidad){
            List<MedicoEntity> medicos = new ArrayList<>();
            medicoRepository.findAll().forEach(medico -> {
                if(medico.getEspecialidad().getId() == especialidad){
                    medicos.add(medico);
                }
            });
            List<MedicoDTO> medicosDTO = new ArrayList<>();
            medicos.forEach(medico -> {
                medicosDTO.add(new MedicoDTO(medico.getId(), medico.getNombre(), medico.getIdentificacion(), medico.getCorreo(), medico.getEspecialidad().getId()));
            });
            return medicosDTO;
        }

        public ResponseEntity<MedicoEntity> guardar(Medico medico){
            MedicoEntity medicoEntity = new MedicoEntity();
            medicoEntity.setNombre(medico.getNombre());
            medicoEntity.setIdentificacion(medico.getIdentificacion());
            medicoEntity.setCorreo(medico.getCorreo());
            medicoEntity.setEspecialidad(especialidadRepository.findById(medico.getEspecialidad()).get());
            return ResponseEntity.ok( medicoRepository.save(medicoEntity));
        }

        public void eliminar(Long id){
            medicoRepository.deleteById(id);
        }

}
