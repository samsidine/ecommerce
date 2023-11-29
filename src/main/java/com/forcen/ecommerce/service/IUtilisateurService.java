package com.forcen.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.forcen.ecommerce.dto.UtilisateurDTO;


public interface IUtilisateurService {
	
	UtilisateurDTO save(UtilisateurDTO user);
	
	List<UtilisateurDTO> listUsers();
	
	UtilisateurDTO getUserById(int id);

}
