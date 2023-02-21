package com.devtech.demoapp.service;

import com.devtech.demoapp.modele.Categorie;
import com.devtech.demoapp.repository.CategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategorieServiceImpl implements CategorieService{

    private final CategorieRepository categorieRepository;
    @Override
    public Categorie creer(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public List<Categorie> lire() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie modifier(Categorie categorie, Long id) {
        return categorieRepository.findById(id).map(
                c -> {
                    c.setNom(categorie.getNom());
                    c.setDescription(categorie.getDescription());
                    return categorieRepository.save(c);
                }).orElseThrow(() -> new RuntimeException("Catégorie modifié"));
    }

    @Override
    public String supprimer(Long id) {
        categorieRepository.deleteById(id);
        return "Catégorie supprimé!";

    }
}
