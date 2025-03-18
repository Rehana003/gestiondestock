package com.example.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="commandefournisseur")

public class CommandeFournisseur  extends AbstractEntity {
    
    @Column (name = "code")
    private String code;


    @Column (name = "datecommande")
    private Instant datecommande;

    @ManyToOne
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;


    @OneToMany (mappedBy = "commandefournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;


    
}
