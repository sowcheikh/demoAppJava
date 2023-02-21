package com.devtech.demoapp.service;

import com.devtech.demoapp.modele.Produit;

import java.util.List;

public interface ProduitService {

    Produit creer(Produit produit);

    List<Produit> lire();

    Produit lireUnProduit(Long id);

    Produit modifier(Long id, Produit produit);

    String supprimer(Long id);
}
