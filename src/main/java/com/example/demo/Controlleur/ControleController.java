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

import com.example.demo.entite.Controle;
import com.example.demo.services.ControleService;

@RestController
@RequestMapping("/api")
public class ControleController {

    @Autowired
    private ControleService controleService;

    @GetMapping("/all")
    public List<Controle> getAllControles() {
        return controleService.getAllControles();
    }

    @PostMapping("/save")
    public Controle createControle(@RequestBody Controle controle) {
        return controleService.saveControle(controle);
    }
    
    

     	@GetMapping("/{id}")
    public ResponseEntity<Controle> getControleById(@PathVariable Integer id) {
        Controle controle = controleService.getControleById(id);
        return ResponseEntity.ok(controle);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteControle(@PathVariable Integer id) {
        controleService.deleteControle(id);
        return ResponseEntity.noContent().build();
    }
}