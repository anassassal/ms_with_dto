package com.example.clientservice.ents;

import com.example.clientservice.model.Produit;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString @Data @Builder
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String nom;
    private String ville;
//    private long idProduit;
//    @Transient
//    private Produit produit;

}
