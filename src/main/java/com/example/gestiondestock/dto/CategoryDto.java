package com.example.gestiondestock.dto;

import com.example.gestiondestock.model.Article;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder

public class CategoryDto {
    private String code;
    private String designation;
    private List<ArticleDto> articles;
}
