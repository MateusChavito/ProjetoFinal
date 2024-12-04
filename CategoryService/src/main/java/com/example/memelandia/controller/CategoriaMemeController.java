package com.example.memelandia.controller;

import com.example.memelandia.entities.CategoriaMeme;
import com.example.memelandia.services.CategoriaMemeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/categorias")
public class CategoriaMemeController {

    private final CategoriaMemeService service;

    public CategoriaMemeController(CategoriaMemeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<CategoriaMeme>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<CategoriaMeme> salvar(@RequestBody CategoriaMeme categoria) {
        return ResponseEntity.ok(service.salvar(categoria));
    }
}

