package com.unicauca.enfa2.Appoint.me.fecha;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fecha")
@AllArgsConstructor
public class FechaRestController {
    private final FechaService fechaService;
    @CrossOrigin(origins = "http://localhost:4200")

    @RequestMapping("/guardar")
    public void guardar(@RequestBody FechaDisponibleDTO fechaDisponibleDTO){
     fechaService.guardar(fechaDisponibleDTO);
    }
    @CrossOrigin(origins = "http://localhost:4200")

    @GetMapping("/listar")
    public List<FechaDTO> listar(@RequestParam Long idMedico){
       return fechaService.listar(idMedico);

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        fechaService.eliminar(id);
    }
}
