package com.example.demo.services;

import java.io.IOException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.entite.Acte;
import com.example.demo.repos.ActeRepository;

@Service
public class ActeServiceImpl implements ActeService{

	
	@Autowired
	ActeRepository acteRepository;
	



	
	public Acte saveActe(Acte acte) {

//        return acteRepository.save(acte);
		
		return null ; 
	}

	public List<Acte> getAllActes() {

        return acteRepository.findAll();
	}

	@Override
	public Optional<Acte> getHistoryByActeId(Long id) {

		return acteRepository.findById(id);
	}
	
	
	@Override
	public void saveFile(MultipartFile file) {
//	    ActFile acte = new ActFile();
//	    try {
//	        acte.setFileContent(file.getBytes());
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	    }
//	    ActFilRepository.save(acte);
	}


}
