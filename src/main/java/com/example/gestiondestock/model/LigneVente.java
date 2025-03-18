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
@Table(name ="lignevente")
public class LigneVente extends AbstractEntity {

    @ManyToOne
    @JoinColumn (name = "idvente")
    private Vente vente;

    @Column (name = "quantite")
    private BigDecimal quantite;

    @Column ( name = "prixunitaire")
    private BigDecimal prixUnitaire;

}
