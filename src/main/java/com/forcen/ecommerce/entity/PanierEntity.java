package com.forcen.ecommerce.entity;

import java.io.Serializable;
import java.util.List;

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
@Table(name="PANIER")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PanierEntity implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="ID")
	private int id;
	 
	 //@Column(name="PRODUITS")
	// private List<ProduitEntity>  produits;
	
	 @Column(name="TOTAL")
	 private int total;
	 
	 
}
