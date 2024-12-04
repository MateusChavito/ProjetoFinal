package com.example.memelandia.services;

import com.example.memelandia.entities.Usuario;
import com.example.memelandia.repositories.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public List<Usuario> listaTodosUsuarios() {
        return repositorioUsuario.findAll();
    }

    public Usuario novoUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }
}

