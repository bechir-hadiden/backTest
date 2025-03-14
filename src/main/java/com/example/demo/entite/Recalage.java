package com.example.demo.entite;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Recalage")
public class Recalage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation
    private Long id;

    private String description;

    private LocalDate dateRecalage;

    @OneToOne
    @JoinColumn(name = "id_categorie", nullable = false, unique = true) // Relation 1-1
    private Categorie categorie;

    
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public LocalDate getDateRecalage() {
		return dateRecalage;
	}

	public void setDateRecalage(LocalDate dateRecalage) {
		this.dateRecalage = dateRecalage;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

  


}
