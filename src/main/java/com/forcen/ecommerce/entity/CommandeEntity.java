package com.forcen.ecommerce.entity;

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

@Entity
@Table(name="COMMANDE")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CommandeEntity {
	
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="ID")
	private int id;
	 
	 @Column(name="DATE")
	 private Date date;
	
	 @Column(name="STAU")
	 private String prenom;
	 
	 @Column(name="EMAIL")
	 private String email;
	

}
