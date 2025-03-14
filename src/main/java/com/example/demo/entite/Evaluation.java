package com.example.demo.entite;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "evaluation")
public class Evaluation {

    @EmbeddedId
    private Long id;

    private Integer note;

    @ManyToOne
    @MapsId("id_controle")
    @JoinColumn(name = "id_controle")
    private Controle controle;

    @ManyToOne
    @MapsId("critereId")
    @JoinColumn(name = "critere_id")
    private Critere critere;
}



