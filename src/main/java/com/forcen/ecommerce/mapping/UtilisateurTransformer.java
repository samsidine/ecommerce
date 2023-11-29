package com.forcen.ecommerce.mapping;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.forcen.ecommerce.dto.UtilisateurDTO;
import com.forcen.ecommerce.entity.UtilisateurEntity;

@Service
public class UtilisateurTransformer {
	
	
	public UtilisateurDTO getDTO(UtilisateurEntity user) {
		UtilisateurDTO dto = new UtilisateurDTO();
		BeanUtils.copyProperties(user, dto);
		return dto;
	}
	
	public UtilisateurEntity getEntity(UtilisateurDTO dto) {
		UtilisateurEntity user = new UtilisateurEntity();
		BeanUtils.copyProperties(dto,user);
		return user;
	}

//	UtilisateurDTO getUtilusateurDTO(UtilisateurEntity in) {
//		UtilisateurDTO out = new UtilisateurDTO();
//		out.setId(in.getId());
//		out.setEmail(in.getEmail());
//		
//		
//		return out;
//	}
//	
//	UtilisateurEntity getUtilusateurEntity(UtilisateurDTO in) {
//		UtilisateurEntity out = new UtilisateurEntity();
//		out.setId(in.getId());
//		out.setEmail(in.getEmail());
//		
//		
//		return out;
//	}
}
