package com.devtech.demoapp.service;

import com.devtech.demoapp.modele.Categorie;
import com.devtech.demoapp.modele.Produit;

import java.util.List;

public interface ProduitService {

    Produit creer(Produit produit);

    List<Produit> lire();

    Produit lireUnProduit(Long id);

    Produit modifier(Long id, Produit produit);

    String supprimer(Long id);
    List<Produit> findByNomProduit(String nom);
    List<Produit> findByNomProduitContains(String nom);
    List<Produit> findByNomPrix (String nom, Double prix);
    List<Produit> findByCategorie (Categorie categorie);
    List<Produit> findByCategorieId(Long id);
    List<Produit> findByOrderByNomProduitAsc();
    List<Produit> trierProduitsNomsPrix();
}
