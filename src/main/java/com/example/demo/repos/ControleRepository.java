package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entite.Controle;

@Repository
public interface ControleRepository extends JpaRepository<Controle, Integer> {
}
