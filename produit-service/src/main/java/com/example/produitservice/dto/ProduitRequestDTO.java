package com.example.produitservice.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString @Data @Builder
public class ProduitRequestDTO {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduit;
    private String marque;
    private String description;
    private Double prix;
    private Integer quantite;
}

