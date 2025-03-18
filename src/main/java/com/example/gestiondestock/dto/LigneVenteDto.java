package com.example.gestiondestock.dto;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDto {


    private VenteDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
