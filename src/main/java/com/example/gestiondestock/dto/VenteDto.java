package com.example.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder

public class VenteDto {
    private String code ;
    private Instant dateVente;
    private String commentaire;
}
