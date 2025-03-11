package com.example.demo.services;

import java.util.List;

import com.example.demo.entite.Categorie;
import com.example.demo.entite.Controle;

public interface ControleService {
	
    public List<Controle> getAllControles();
    
    public Controle saveControle(Controle controle); 	

    public Controle getControleById(Integer id); 

     public void deleteControle(Integer id) ;

     public Categorie saveCategorie(Categorie categorie) ;
     
     public List<Categorie> getAllCategories();



}
