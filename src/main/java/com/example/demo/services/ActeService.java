package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entite.Acte;

public interface ActeService {
	
	
    public Acte saveActe(Acte acte);
    
    public List<Acte> getAllActes();

    public Optional<Acte>  getHistoryByActeId(Long id);
   
	void saveFile(MultipartFile file) ;


}
