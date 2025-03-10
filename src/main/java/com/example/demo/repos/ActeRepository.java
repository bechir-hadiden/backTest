package com.example.demo.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entite.Acte;

public interface ActeRepository extends JpaRepository<Acte, Long> {
    List<Acte> findByType(String type);
    List<Acte> findByActeId(Long id);
//	void save(ActFile acte);

}
