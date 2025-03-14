package com.example.demo.entite;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Controle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_controle;

    private LocalDate dateControle;
    private Float tauxConformite;
    private Boolean etat;

    @ManyToOne
    @JoinColumn(name = "id_acte")
    private Acte acte;

    @ManyToOne
    @JoinColumn(name = "cuid")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private Categorie categorie;

    @OneToMany(mappedBy = "controle", cascade = CascadeType.ALL)
    private List<Evaluation> evaluations;
}

    

