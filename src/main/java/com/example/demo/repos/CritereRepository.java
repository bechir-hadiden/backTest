package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entite.Critere;

@Repository
public interface CritereRepository extends JpaRepository<Critere, Integer> {
}
