package com.example.gestiondestock.dto;


import com.example.gestiondestock.model.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data


public class ArticleDto {
    private String codeArticle;
    private String Designation;
    private BigDecimal PrixUnitaireHt;
    private BigDecimal TauxTva;
    private BigDecimal PrixUnitairettc;
    private String photo;
    private CategoryDto category;
}
