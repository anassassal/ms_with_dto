package com.example.produitservice.reps;

import com.example.produitservice.ents.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ProduitRepository  extends JpaRepository<Produit,Integer> {
}
