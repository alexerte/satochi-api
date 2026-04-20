package com.Blockchaine.Satochi.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;


@Entity
@Table(name="currency")

public class Currency {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nom;

    @Size(min = 3,max = 4)
    private String symbole;


    private BigDecimal quantiteDetenue;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotBlank
    private String clePrivee;


    public Currency() {
    }

    public Currency(Integer id, String nom, String symbole, BigDecimal quantiteDetenue, String clePrivee) {
        this.id = id;
        this.nom = nom;
        this.symbole = symbole;
        this.quantiteDetenue = quantiteDetenue;
        this.clePrivee = clePrivee;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getSymbole() {
        return symbole;
    }

    public BigDecimal getQuantiteDetenue() {
        return quantiteDetenue;
    }

    public String getClePrivee() {
        return clePrivee;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public void setQuantiteDetenue(BigDecimal quantiteDetenue) {
        this.quantiteDetenue = quantiteDetenue;
    }

    public void setClePrivee(String clePrivee) {
        this.clePrivee = clePrivee;
    }
}
