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
    public Produit lireUnProduit(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public Produit modifier(Long id, Produit produit) {
        return produitRepository.findById(id).map(
                p -> {
                 p.setNomProduit(produit.getNomProduit());
                 p.setPrixProduit(produit.getPrixProduit());
                 return produitRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("produit non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        produitRepository.deleteById(id);
        return "produit supprimé!";
    }
}
