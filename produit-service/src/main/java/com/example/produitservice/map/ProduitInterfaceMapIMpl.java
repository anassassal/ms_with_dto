package com.example.produitservice.map;

import com.example.produitservice.dto.ProduitReponseDTO;
import com.example.produitservice.dto.ProduitRequestDTO;
import com.example.produitservice.ents.Produit;
import org.springframework.beans.BeanUtils;

public class ProduitInterfaceMapIMpl implements ProduitInterfaceMap{
    @Override
    public Produit produitRequestDTO2Produit(ProduitRequestDTO produitRequestDTO) {
        Produit p=new Produit();
        BeanUtils.copyProperties(produitRequestDTO,p);
        return p;
    }

    @Override
    public ProduitReponseDTO produit2ProduitReponseDTO(Produit produit) {
        ProduitReponseDTO p=new ProduitReponseDTO();
        BeanUtils.copyProperties(produit,p);
        return p;
    }
}
