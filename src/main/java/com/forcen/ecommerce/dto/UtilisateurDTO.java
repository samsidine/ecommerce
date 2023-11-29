package com.forcen.ecommerce.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurDTO implements Serializable{

	private int id;
	 
	 private String nom;
	
	 private String prenom;
	 
	 private String email;
	 
	 private int tel;
	
	 private String typeutilisateur;
}
