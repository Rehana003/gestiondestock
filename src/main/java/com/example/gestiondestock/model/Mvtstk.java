package com.example.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="mvtstk")

public class Mvtstk extends AbstractEntity {

    @Column ( name = "datemvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn (name = "idarticle")
    private Article article;

    @Column (name = "typemvt")
    private TypeMvtStk typeMvt;
}
