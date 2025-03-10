package com.example.demo.entite;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Critere {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String libelle;
    private String idPrestation;

    @OneToMany(mappedBy = "critere")
    private List<Evaluation> evaluations;

    // Getters et setters

}
