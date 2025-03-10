package com.example.demo.entite;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Acte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private Long acteId; 
    private String type; 
    private String description; 
    private LocalDate dateModification; 
    private String modifiedBy; 
    private LocalDateTime modificationDate;
    
//    @OneToOne(cascade = CascadeType.ALL)
//    private ActFile actFile;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getActeId() {
		return acteId;
	}
	
	public void setActeId(Long acteId) {
		this.acteId = acteId;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public LocalDate getDateModification() {
		return dateModification;
	}
	
	public void setDateModification(LocalDate dateModification) {
		this.dateModification = dateModification;
	}
	
	public String getModifiedBy() {
		return modifiedBy;
	}
		
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	public LocalDateTime getModificationDate() {
		return modificationDate;
	}
	
	public void setModificationDate(LocalDateTime modificationDate) {
		this.modificationDate = modificationDate;
	}

//	public ActFile getActFile() {
//		return null;
//	}

//	public void setActFile(ActFile actFile) {
//		this.actFile = actFile;
//	}


    
    
   



}
