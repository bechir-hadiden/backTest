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
@RequestMapping("/api")
public class ControleController {

    @Autowired
    private ControleService controleService;

    
    @Autowired
    private CategorieRepository categorieRepository; 
    
    
    @GetMapping("/all")
    public List<Controle> getAllControles() {
        return controleService.getAllControles();
    }

    @PostMapping
    public Controle createControle(@RequestBody Controle controleRequest) {
        Controle controle = new Controle();
        controle.setIdActe(controleRequest.getIdActe());
        controle.setCuid(controleRequest.getCuid());
        controle.setDateControle(controleRequest.getDateControle());
        controle.setTauxConformite(controleRequest.getTauxConformite());
        
        // ✅ Ajout de la gestion de la catégorie
        Categorie categorie = categorieRepository.findById(controleRequest.getIdCategorie())
                .orElseThrow(() -> new RuntimeException("Categorie not found"));
        controle.setCategorie(categorie);

        // ✅ Ajout de la gestion du champ etat
        controle.setEtat(controleRequest.getEtat());

        return categorieRepository.save(controle);
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