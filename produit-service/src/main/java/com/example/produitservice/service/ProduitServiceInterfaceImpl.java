package com.example.produitservice.service;

import com.example.produitservice.dto.ProduitReponseDTO;
import com.example.produitservice.dto.ProduitRequestDTO;
import com.example.produitservice.ents.Produit;
import com.example.produitservice.map.ProduitInterfaceMap;
import com.example.produitservice.reps.ProduitRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class ProduitServiceInterfaceImpl implements ProduitServiceInterface{
    @Autowired
    ProduitRepository produitRepository;
//    @Autowired
    ProduitInterfaceMap produitInterfaceMap;
    @Override
    public void add(ProduitRequestDTO produitRequestDTO) {
        Produit p=new Produit();
        p=produitInterfaceMap.produitRequestDTO2Produit(produitRequestDTO);
        produitRepository.save(p);

    }

    @Override
    public List<ProduitReponseDTO> listerProduits() {
        List<Produit> l=new ArrayList<Produit>();
        l=produitRepository.findAll();
        List<ProduitReponseDTO> liste=new ArrayList<ProduitReponseDTO>();
        for (Produit p:l){
            liste.add(produitInterfaceMap.produit2ProduitReponseDTO(p));
        }
        return liste;
    }

    @Override
    public ProduitReponseDTO produitById(Integer id) {
        ProduitReponseDTO p=new ProduitReponseDTO();
        p=produitInterfaceMap.produit2ProduitReponseDTO(produitRepository.findById(id).get());
        return p;
    }

    @Override
    public void update(Integer id, ProduitRequestDTO p) {
        Produit produit=produitRepository.findById(id).get();
        if (p.getPrix()!=null)produit.setPrix(p.getPrix());
        if (p.getDescription()!=null)produit.setDescription(p.getDescription());
        if (p.getMarque()!=null)produit.setMarque(p.getMarque());
        if (p.getQuantite()!=null)produit.setQuantite(p.getQuantite());
        produitRepository.save(produit);

    }

    @Override
    public void supprim(Integer id) {
        produitRepository.deleteById(id);
    }
}
