package com.forcen.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="PAIEMENT")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PaiementEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="ID")
	private int id;
	 
	 @Column(name="DATE")
	 private Date date;
	
	 @Column(name="MONTANT")
	 private double montant;
	 
	 @Column(name="MODE-DE-PAIEMENT")
	 private String modeDePaiement;
	

}
