package com.example.demo.entite;

import java.time.LocalDate;
import java.util.List;

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

@Entity
@Getter
@Setter
public class Controle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer idActe;

    @Column(nullable = false)
    private Integer cuid;

    @Column(nullable = false)
    private LocalDate dateControle;

    @Column(nullable = false)
    private Float tauxConformite;

    // ✅ Champ manquant ajouté
    @Column(nullable = false)
    private Integer idCategorie;

    // ✅ Champ pour l'état (true/false)
    @Column(nullable = false)
    private Boolean etat;

    // ✅ Si tu veux une relation avec la table `Categorie`
    @ManyToOne
    @JoinColumn(name = "idCategorie", insertable = false, updatable = false)
    private Categorie categorie;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdActe() {
		return idActe;
	}

	public void setIdActe(Integer idActe) {
		this.idActe = idActe;
	}

	public Integer getCuid() {
		return cuid;
	}

	public void setCuid(Integer cuid) {
		this.cuid = cuid;
	}

	public LocalDate getDateControle() {
		return dateControle;
	}

	public void setDateControle(LocalDate dateControle) {
		this.dateControle = dateControle;
	}

	public Float getTauxConformite() {
		return tauxConformite;
	}

	public void setTauxConformite(Float tauxConformite) {
		this.tauxConformite = tauxConformite;
	}

	public Integer getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
    
    
    
}
