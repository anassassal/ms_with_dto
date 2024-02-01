package com.example.produitservice.map;

import com.example.produitservice.dto.ProduitReponseDTO;
import com.example.produitservice.dto.ProduitRequestDTO;
import com.example.produitservice.ents.Produit;

public interface ProduitInterfaceMap {
    public Produit produitRequestDTO2Produit(ProduitRequestDTO produitRequestDTO);
    public ProduitReponseDTO produit2ProduitReponseDTO(Produit produit);
}
