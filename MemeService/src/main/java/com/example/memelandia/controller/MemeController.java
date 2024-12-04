package com.example.memelandia.controller;
import com.example.memelandia.entities.Meme;
import com.example.memelandia.services.MemeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memes")
public class MemeController {

    private final MemeService service;

    public MemeController(MemeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Meme>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Meme> salvar(@RequestBody Meme meme) {
        return ResponseEntity.ok(service.salvar(meme));
    }
}
