package com.example.demo.entite;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Acte {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idActe;
	    private LocalDate dateReception;
	    @OneToMany(mappedBy = "acte", cascade = CascadeType.ALL)
	    private List<Controle> controles;
	    
	    
	    
	    
	    
	    

		public Long getIdActe() {
			return idActe;
		}

		public void setIdActe(Long idActe) {
			this.idActe = idActe;
		}

		public LocalDate getDateReception() {
			return dateReception;
		}

		public void setDateReception(LocalDate dateReception) {
			this.dateReception = dateReception;
		}

		public List<Controle> getControles() {
			return controles;
		}

		public void setControles(List<Controle> controles) {
			this.controles = controles;
		}
	    
	    
	    


	

    
    
   



}
