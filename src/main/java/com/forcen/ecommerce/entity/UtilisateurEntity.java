package com.forcen.ecommerce.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @ehemba
 */
@Entity
@Table(name="UTILISATEUR")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurEntity implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="ID")
	private int id;
	 
	 @Column(name="NOM")
	 private String nom;
	
	 @Column(name="PRENOM")
	 private String prenom;
	 
	 @Column(name="EMAIL")
	 private String email;
	 
	 @Column(name="TELEPHONE")
	 private int tel;
	
	 @Column(name="TYPE UTILISATEUR")
	 private String typeutilisateur;
	 
	 
	
}
