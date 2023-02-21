package com.devtech.demoapp.controller;

import com.devtech.demoapp.modele.Produit;
import com.devtech.demoapp.service.ProduitService;
import com.devtech.demoapp.utils.EndpointApp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(EndpointApp.URL_PRODUIT)
@AllArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @PostMapping(EndpointApp.CREATE_PRODUIT)
    public Produit create(@RequestBody Produit produit) {
        return produitService.creer(produit);
    }

    @GetMapping(EndpointApp.READ_PRODUIT)
    public List<Produit> read() {
        return produitService.lire();
    }

    @GetMapping(EndpointApp.READ_ONE_PRODUIT)
    public Produit readOneProduct(@PathVariable Long id) {
        return produitService.lireUnProduit(id);
    }

    @PutMapping(EndpointApp.PUT_PRODUIT)
    public Produit update(@RequestBody Produit produit, @PathVariable Long id) {
        return produitService.modifier(id, produit);
    }

    @DeleteMapping(EndpointApp.DELETE_PRODUIT)
    public String delete(@PathVariable Long id) {
        return produitService.supprimer(id);
    }
}
