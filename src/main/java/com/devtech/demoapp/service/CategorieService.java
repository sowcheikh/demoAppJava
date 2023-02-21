package com.devtech.demoapp.service;

import com.devtech.demoapp.modele.Categorie;

import java.util.List;

public interface CategorieService {

    Categorie creer(Categorie categorie);

    List<Categorie> lire();

    Categorie modifier(Categorie categorie, Long id);

    String supprimer(Long id);
}
