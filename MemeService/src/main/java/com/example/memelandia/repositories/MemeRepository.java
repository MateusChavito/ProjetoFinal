package com.example.memelandia.repositories;


import com.example.memelandia.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemeRepository extends JpaRepository<Meme, Long> {
}
