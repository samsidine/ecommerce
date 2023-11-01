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
@Table(name="PRODUITS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitEntity implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 55667606231042051L;

	@Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="ID")
	private int id;
	 
	 @Column(name="NOM")
	 private String nom;
	
	 @Column(name="DESCIPTION")
	 private String desciption;
	 
	 @Column(name="PRIX")
	 private double prix;
	 
	 @Column(name="QUANTITE_STOCK")
	 private int quantiteStock;
	 
	 
}
