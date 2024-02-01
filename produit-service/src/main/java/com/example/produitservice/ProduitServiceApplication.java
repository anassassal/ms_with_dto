package com.example.produitservice;

import com.example.produitservice.ents.Produit;
import com.example.produitservice.reps.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ProduitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProduitServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProduitRepository produitRepository){
		return args -> {
			Produit p=Produit.builder().marque("hp").description("hp elitbook ").prix(222.30).quantite(2).build();
			produitRepository.save(p);
			List<Produit> produits=produitRepository.findAll();
			for (Produit p1:produits){
				System.out.println("----------------");
				System.out.println(p1.getMarque());
				System.out.println(p1.getPrix());
				System.out.println(p1.getDescription());
				System.out.println(p1.getQuantite());
			}




		};
	}

}
