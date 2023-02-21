package com.devtech.demoapp.controller;

import com.devtech.demoapp.modele.Categorie;
import com.devtech.demoapp.service.CategorieService;
import com.devtech.demoapp.utils.EndpointApp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(EndpointApp.URL_CATEGORIE)
@AllArgsConstructor
public class CategorieController {
    private final CategorieService categorieService;

    @PostMapping(EndpointApp.CREATE_CATEGORIE)
    public Categorie create(@RequestBody Categorie categorie) {
        return categorieService.creer(categorie);
    }

    @GetMapping(EndpointApp.READ_CATEGORIE)
    public List<Categorie> read() {
        return categorieService.lire();
    }

    @PutMapping(EndpointApp.PUT_CATEGORIE)
    public Categorie update(@RequestBody Categorie categorie, @PathVariable Long id) {
        return categorieService.modifier(categorie, id);
    }

    @DeleteMapping(EndpointApp.DELETE_CATEGORIE)
    public String delete(@PathVariable Long id) {
        return categorieService.supprimer(id);
    }
}
