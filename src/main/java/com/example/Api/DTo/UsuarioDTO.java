package com.example.Api.DTo;

import com.example.Api.Model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private String nombre;
    private String apellido;


    public UsuarioDTO(Usuario usuario) {
        this.nombre = usuario.getNombre().toUpperCase();
        this.apellido = usuario.getApellido().toUpperCase();
    }
}