package com.example.demo.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Evaluation {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "controle_id")
    private Controle controle;

    @ManyToOne
    @JoinColumn(name = "critere_id")
    private Critere critere;

    private String evaluation;

    // Getters et setters
}

