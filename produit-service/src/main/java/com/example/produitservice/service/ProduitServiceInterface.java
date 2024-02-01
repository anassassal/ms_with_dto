package com.example.produitservice.service;

import com.example.produitservice.dto.ProduitReponseDTO;
import com.example.produitservice.dto.ProduitRequestDTO;

import java.util.List;

public interface ProduitServiceInterface {
    public void add(ProduitRequestDTO produitRequestDTO );
    public List<ProduitReponseDTO> listerProduits();
    public ProduitReponseDTO produitById(Integer id);
    public void update(Integer id ,ProduitRequestDTO p);
    public void supprim(Integer id);
}
