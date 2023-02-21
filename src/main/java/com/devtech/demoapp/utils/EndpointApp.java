package com.devtech.demoapp.utils;

public interface EndpointApp {

    // PODUITS
    String URL_PRODUIT = "/api/produits";
    String CREATE_PRODUIT = "/create";
    String READ_PRODUIT = "/read";
    String READ_ONE_PRODUIT = "/read/{id}";
    String PUT_PRODUIT = "/update/{id}";
    String DELETE_PRODUIT = "/delete/{id}";

    // CATEGORIES

    String URL_CATEGORIE = "/api/categories";
    String CREATE_CATEGORIE = "/create";
    String READ_CATEGORIE = "/read";
    String PUT_CATEGORIE = "/update/{id}";
    String DELETE_CATEGORIE = "/delete/{id}";

}
