package com.example.Api.Controller;

import com.example.Api.DTo.UsuarioDTO;
import com.example.Api.Model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Params {

    @GetMapping("/params")
    public ResponseEntity<UsuarioDTO> procesarParams(
            @RequestParam String nombre,
            @RequestParam String apellido) {
        Usuario tempUser = new Usuario();
        tempUser.setNombre(nombre);
        tempUser.setApellido(apellido);
        UsuarioDTO respuesta = new UsuarioDTO(tempUser);
        return ResponseEntity.ok(respuesta);
    }
}
