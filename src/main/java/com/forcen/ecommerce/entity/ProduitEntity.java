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
@Table(name="PRODUIT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitEntity {

	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="ID")
	private int id;
	 
	 
}
