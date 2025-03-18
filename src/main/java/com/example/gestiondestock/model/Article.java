package com.example.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="article")
public class Article extends AbstractEntity {

    @Column(name = "codearticle")
    private String codeArticle;

    @Column(name = "desgnation")
    private String designation;

    @Column(name = "prixunitaireht")
    private BigDecimal PrixUnitaireHt;

    @Column(name = "tauxtva")
    private BigDecimal TauxTva;

    @Column(name = "prixunitairettc")
    private BigDecimal PrixUnitairettc;

    @Column(name ="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;

}