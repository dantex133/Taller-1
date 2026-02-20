package com.example.Api.Service;

import com.example.Api.DTo.UsuarioDTO;
import com.example.Api.Model.Usuario;
import com.example.Api.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public UsuarioDTO crearUsuario(Usuario usuario) {


        usuario.setContraseña(passwordEncoder.encode(usuario.getContraseña()));

        Usuario usuarioGuardado = usuarioRepository.save(usuario);

        return new UsuarioDTO(usuarioGuardado);
    }




    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    public UsuarioDTO obtenerUsuarioPorId(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));
        return new UsuarioDTO(usuario);
    }


    public UsuarioDTO obtenerporNombre(String nombre, String apellido) {
        Usuario usuario = usuarioRepository.findByNombreAndApellido(nombre, apellido)
                .orElseThrow(() -> new UsuarioNotFoundException("Usuario no encontrado con nombre: " + nombre + " y apellido: " + apellido));
        return new UsuarioDTO(usuario);
    }
}