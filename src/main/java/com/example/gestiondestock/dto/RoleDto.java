package com.example.gestiondestock.dto;



import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class RoleDto {


    private String roleName;
    private UtilisateurDto utilisateur;
}
