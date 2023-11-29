package com.forcen.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.forcen.ecommerce.entity.UtilisateurEntity;

@Repository
public interface IUtilisateurDAO extends JpaRepository<UtilisateurEntity, Integer>{

}
