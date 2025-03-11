package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entite.Categorie;
import com.example.demo.entite.Controle;
import com.example.demo.repos.CategorieRepository;
import com.example.demo.repos.ControleRepository;

import jakarta.persistence.EntityNotFoundException;




@Service
public class ControleServiceImpl implements ControleService{
	
	
	
	  @Autowired
	    private ControleRepository controleRepository;
	  
	  @Autowired
	    private CategorieRepository categorieRepository;

	    public List<Controle> getAllControles() {
	        return controleRepository.findAll();
	    }

	    public Controle saveControle(Controle controle) {
	        return controleRepository.save(controle);
	    }
	    
	    
	    public Controle getControleById(Integer id) {
	        return controleRepository.findById(id)
	                .orElseThrow(() -> new EntityNotFoundException("Contrôle non trouvé avec l'ID " + id));
	    }

	    public void deleteControle(Integer id) {
	        if (!controleRepository.existsById(id)) {
	            throw new EntityNotFoundException("Contrôle non trouvé avec l'ID " + id);
	        }
	        controleRepository.deleteById(id);
	    }
	    
	    
	    public Categorie saveCategorie(Categorie categorie) {
	        return categorieRepository.save(categorie);
	    }

	    public List<Categorie> getAllCategories() {
	        return categorieRepository.findAll();
	    }

}
