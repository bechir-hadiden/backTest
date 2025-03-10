package com.example.demo.entite;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Controle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate dateControle;
    private Float tauxConformite;

    @ManyToOne
    @JoinColumn(name = "id_acte")
    private Acte acteTraitement;

    @ManyToOne
    @JoinColumn(name = "cuid")
    private User user;

    @OneToMany(mappedBy = "controle")
    private List<Evaluation> evaluations;

    // Getters et setters
}