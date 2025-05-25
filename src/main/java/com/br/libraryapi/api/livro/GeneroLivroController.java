package com.br.libraryapi.api.livro;

import com.br.libraryapi.modelo.livro.GeneroLivro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/genero")
@CrossOrigin
public class GeneroLivroController {
    @GetMapping
    public ResponseEntity<GeneroLivro[]> listarGeneros() {
        return ResponseEntity.ok(GeneroLivro.values());
    }
}
