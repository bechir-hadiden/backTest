package com.example.demo.Controlleur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entite.Acte;
import com.example.demo.services.ActeService;

@RestController
@RequestMapping("/api/actes")
public class ActeController {
	
	
	@Autowired
	 ActeService acteService;


    @GetMapping("/all")
    public ResponseEntity <List<Acte>> getAllActes() {
    	List <Acte> act = acteService.getAllActes();
        return ResponseEntity.ok(act);
    }

    @PostMapping("/save")
    public Acte createActe(@RequestBody Acte acte) {
        return acteService.saveActe(acte);
    }
      
    @GetMapping("/actes/{id}")
    public Optional<Acte> getActeHistory(@PathVariable Long id) {
        return acteService.getHistoryByActeId(id);
    }
    
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            acteService.saveFile(file); 
            return ResponseEntity.ok("Fichier sauvegardé avec succès !");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erreur lors de la sauvegarde du fichier : " + e.getMessage());
        }
    }

}