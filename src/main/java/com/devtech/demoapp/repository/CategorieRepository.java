package com.devtech.demoapp.repository;

import com.devtech.demoapp.modele.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
