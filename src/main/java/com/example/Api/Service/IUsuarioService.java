package com.example.Api.Service;

import com.example.Api.DTo.UsuarioDTO;
import com.example.Api.Model.Usuario;
import java.util.List;

public interface IUsuarioService {
    UsuarioDTO crearUsuario(Usuario usuario);
    List<Usuario> obtenerTodosLosUsuarios();
    UsuarioDTO obtenerUsuarioPorId(Long id);
    UsuarioDTO obtenerporNombre(String nombre, String apellido);
}
