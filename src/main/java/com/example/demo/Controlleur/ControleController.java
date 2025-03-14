package com.example.demo.Controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entite.Categorie;
import com.example.demo.entite.Controle;
import com.example.demo.repos.CategorieRepository;
import com.example.demo.services.ControleService;

@RestController
@RequestMapping("/api/controles")
public class ControleController {
    @Autowired
    private ControleService controleService;

    @GetMapping
    public List<Controle> getAllControles() {
        return controleService.getAllControles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Controle> getControleById(@PathVariable Integer id) {
        Controle controle = controleService.getControleById(id);
        return controle != null ? ResponseEntity.ok(controle) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Controle createControle(@RequestBody Controle controle) {
        return controleService.saveControle(controle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteControle(@PathVariable Integer id) {
        controleService.deleteControle(id);
        return ResponseEntity.noContent().build();
    }
}
