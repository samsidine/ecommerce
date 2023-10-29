package com.forcen.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="UTILISATEUR")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurEntity {
	
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="ID")
	private int id;
	 
	 @Column(name="NOM")
	 private String nom;
	
	 @Column(name="PRENOM")
	 private String prenom;
	 
	

}
