package com.example.produitservice.web;

import com.example.produitservice.dto.ProduitReponseDTO;
import com.example.produitservice.dto.ProduitRequestDTO;
import com.example.produitservice.map.ProduitInterfaceMap;
import com.example.produitservice.reps.ProduitRepository;
import com.example.produitservice.service.ProduitServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    ProduitServiceInterface produitServiceInterface;
    @GetMapping("/produits")
    public List<ProduitReponseDTO> getAll(){
        return produitServiceInterface.listerProduits();
    }
    @GetMapping("/produits/(id)")
    public ProduitReponseDTO getId(@PathVariable("id") Integer id){
        return produitServiceInterface.produitById(id);
    }
    @DeleteMapping("/produits/(id)")
    public void supprimer(@PathVariable("id") Integer id ){
        produitServiceInterface.supprim(id);
    }
    @PostMapping("produits/(id)")
    public void save(@RequestBody ProduitRequestDTO p){
        produitServiceInterface.add(p);
    }
    @PutMapping("produits/(id)")
    public void modify(@PathVariable("id") Integer id,@RequestBody ProduitRequestDTO p){
        produitServiceInterface.update(id,p);
    }
}
