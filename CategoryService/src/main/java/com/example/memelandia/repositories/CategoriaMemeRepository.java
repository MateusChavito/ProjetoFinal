package com.example.memelandia.repositories;

import com.example.memelandia.entities.CategoriaMeme;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaMemeRepository extends JpaRepository<CategoriaMeme, Long> {

}
