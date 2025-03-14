package com.example.demo.entite;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Prestation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrestation;

    private String nom;

    @OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL)
    private List<Categorie> categories;

    @OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL)
    private List<Critere> criteres;
}
