package com.example.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="role")

public class Role extends AbstractEntity {

    @Column(name = "rolename")
    private String roleName;
    @ManyToOne
    @JoinColumn(name = "idutlisateur")
    private Utilisateur utilisateur;

}
