package com.example.demo.entite;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Evaluation {

    @Id
    private Long id;

    @ManyToOne
    @MapsId("controleId")
    private Controle controle;

    @ManyToOne
    @MapsId("critereId")
    private Critere critere;

    @Column(nullable = false)
    private Integer note;
}


