package com.devtech.demoapp;

import com.devtech.demoapp.modele.Produit;
import com.devtech.demoapp.repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class DemoAppApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
		Produit produit = new Produit("test", 1720.0, new Date());
		produitRepository.save(produit);
	}
	@Test
	public void testFindProduit()
	{
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);
	}
	@Test
	public void testUpdateProduit()
	{
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(1000.0);
		produitRepository.save(p);
	}

	@Test
	public void testDeleteProduit()
	{
		produitRepository.deleteById(2L);;
	}
	@Test
	public void testListerTousProduits()
	{
		List<Produit> prods = produitRepository.findAll();
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}

	@Test
	public void testFindByNomPoduit()
	{
		List<Produit> prods = produitRepository.findByNomProduit("Produit test");
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}
	@Test
	public void testFindByNomPoduitContains()
	{
		List<Produit> prods = produitRepository.findByNomProduitContains("test");
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}


}
