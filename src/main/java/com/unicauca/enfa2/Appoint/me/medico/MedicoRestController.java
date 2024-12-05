package com.unicauca.enfa2.Appoint.me.medico;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
@AllArgsConstructor
public class MedicoRestController {
private final MedicoService medicoService;
    @CrossOrigin(origins = "http://localhost:4200")

    @GetMapping("/listar")
    public List<MedicoDTO> listar(@RequestParam int especialidad){
        return medicoService.listar(especialidad);
    }

    @CrossOrigin(origins = "http://localhost:4200")

    @PostMapping("/guardar")
    public ResponseEntity<MedicoEntity> guardar(@RequestBody Medico medico){
        return medicoService.guardar(medico);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        medicoService.eliminar(id);
    }
}
