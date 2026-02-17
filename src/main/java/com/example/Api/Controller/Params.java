package com.example.Api.Controller;

import com.example.Api.DTo.NombreCompletoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Params {

    @GetMapping("/params")
    public ResponseEntity<NombreCompletoDTO> procesarParams(
            @RequestParam String nombre,
            @RequestParam String apellido) {
        String nombreCompleto = nombre + " " + apellido;
        NombreCompletoDTO respuesta = new NombreCompletoDTO(nombreCompleto.toUpperCase());
        return ResponseEntity.ok(respuesta);
    }
}
