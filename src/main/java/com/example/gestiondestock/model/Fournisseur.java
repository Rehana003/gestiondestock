package com.example.gestiondestock.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="fournisseur")

public class Fournisseur extends AbstractEntity {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;


    @Embedded
    private String adress;

    @Column(name = "photo")
    private String photo;


    @Column(name = "mail")
    private String mail;

    @Column(name = "numTel")
    private String numTel ;


    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;



}
