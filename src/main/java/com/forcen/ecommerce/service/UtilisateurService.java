package com.forcen.ecommerce.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forcen.ecommerce.dto.UtilisateurDTO;
import com.forcen.ecommerce.entity.UtilisateurEntity;
import com.forcen.ecommerce.mapping.UtilisateurTransformer;
import com.forcen.ecommerce.repository.IUtilisateurDAO;

import jakarta.transaction.Transactional;

@Service
@Transactional(rollbackOn = {Throwable.class})
public class UtilisateurService implements IUtilisateurService{
	
	@Autowired
	IUtilisateurDAO utilisateurDAO;
	
	@Autowired
	UtilisateurTransformer mapper;

	@Override
	public UtilisateurDTO save(UtilisateurDTO user) {
		
		return null;
	}

	@Override
	public List<UtilisateurDTO> listUsers() {
		List<UtilisateurEntity> users = utilisateurDAO.findAll();
		List<UtilisateurDTO> userDtos = users.stream().map(user -> mapper.getDTO(user)).collect(Collectors.toList());
		return userDtos;
	}

	@Override
	public UtilisateurDTO getUserById(int id) {
		UtilisateurEntity user = utilisateurDAO.getById(id);
		UtilisateurDTO dto = mapper.getDTO(user);
		return dto;
	}

}
