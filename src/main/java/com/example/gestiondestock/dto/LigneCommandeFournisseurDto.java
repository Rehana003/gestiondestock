package com.example.gestiondestock.dto;

import com.example.gestiondestock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {
    private ArticleDto article;
    private CommandeFournisseur commandeFournisseur;
    private BigDecimal quantite;
    private BigDecimal prixunitaire;

}

