package com.forcen.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forcen.ecommerce.dto.UtilisateurDTO;
import com.forcen.ecommerce.service.IUtilisateurService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UtilisateurController {
	
	@Autowired
	IUtilisateurService utilisateurService;
	
	@GetMapping("/users")
	public List<UtilisateurDTO> getUtilisateurDTO(){
		return utilisateurService.listUsers();
	}
	
	@GetMapping("/users/{id}")
	public UtilisateurDTO getUserById(@PathVariable(name="id") Integer id) {
		return utilisateurService.getUserById(id);
	}
}
