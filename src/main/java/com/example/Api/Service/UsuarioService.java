package com.example.Api.Service;

import com.example.Api.DTo.UsuarioDTO;
import com.example.Api.Model.Usuario;
import com.example.Api.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public UsuarioDTO crearUsuario(Usuario usuario) {

        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));


        Usuario usuarioGuardado = usuarioRepository.save(usuario);


        return new UsuarioDTO(usuarioGuardado);
    }


    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }
}