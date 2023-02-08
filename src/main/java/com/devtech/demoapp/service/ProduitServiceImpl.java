package com.devtech.demoapp.service;

import com.devtech.demoapp.modele.Produit;
import com.devtech.demoapp.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService{

    private final ProduitRepository produitRepository;
    @Override
    public Produit creer(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> lire() {
        return produitRepository.findAll();
    }

    @Override
    public Produit modifier(Long id, Produit produit) {
        return produitRepository.findById(id).map(
                p -> {
                 p.setNom(produit.getNom());
                 p.setDescription(produit.getDescription());
                 p.setPrix(produit.getPrix());
                 return produitRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("produit non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        produitRepository.deleteById(id);
        return "produit supprimé!";
    }
}
