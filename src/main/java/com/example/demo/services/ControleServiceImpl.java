package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entite.Controle;
import com.example.demo.repos.ControleRepository;

@Service
public class ControleServiceImpl {
	
	
	
	  @Autowired
	    private ControleRepository controleRepository;

	    public List<Controle> getAllControles() {
	        return controleRepository.findAll();
	    }

	    public Controle saveControle(Controle controle) {
	        return controleRepository.save(controle);
	    }

}
