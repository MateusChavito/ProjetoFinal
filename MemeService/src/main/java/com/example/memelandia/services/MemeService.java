package com.example.memelandia.services;

import com.example.memelandia.entities.Meme;
import com.example.memelandia.repositories.MemeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeService {

    private final MemeRepository repository;

    public MemeService(MemeRepository repository) {
        this.repository = repository;
    }

    public List<Meme> listarTodos() {
        return repository.findAll();
    }

    public Meme salvar(Meme meme) {
        return repository.save(meme);
    }
}
