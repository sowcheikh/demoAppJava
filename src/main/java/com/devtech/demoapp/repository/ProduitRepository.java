package com.devtech.demoapp.repository;

import com.devtech.demoapp.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
