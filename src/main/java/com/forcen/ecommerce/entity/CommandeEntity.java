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
@Table(name="COMMANDE")
@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * @ehemba
 */
public class CommandeEntity implements Serializable{
	
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
	
	 @Column(name="STATUT")
	 private String statut;
	 
	 @Column(name="TOTAL")
	 private double total;
	

}
