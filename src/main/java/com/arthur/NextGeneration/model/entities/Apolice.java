package com.arthur.NextGeneration.model.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Apolice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valorApolice;
    private String descricaoCondicoes;
    @OneToOne
    @JoinColumn(name = "seguro_id")
    private Seguro seguro = new Seguro();
    private Date DataAssinatura;
    private Date DataCarencia;

    public Apolice() {
    }

    public Apolice(Long id, double valorApolice, String descricaoCondicoes, Seguro seguro, Date dataAssinatura, Date dataCarencia) {
        this.id = id;
        this.valorApolice = valorApolice;
        this.descricaoCondicoes = descricaoCondicoes;
        this.seguro = seguro;
        DataAssinatura = dataAssinatura;
        DataCarencia = dataCarencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apolice apolice = (Apolice) o;
        return id.equals(apolice.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorApolice() {
        return valorApolice;
    }

    public void setValorApolice(double valorApolice) {
        this.valorApolice = valorApolice;
    }

    public String getDescricaoCondicoes() {
        return descricaoCondicoes;
    }

    public void setDescricaoCondicoes(String descricaoCondicoes) {
        this.descricaoCondicoes = descricaoCondicoes;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public Date getDataAssinatura() {
        return DataAssinatura;
    }

    public void setDataAssinatura(Date dataAssinatura) {
        DataAssinatura = dataAssinatura;
    }

    public Date getDataCarencia() {
        return DataCarencia;
    }

    public void setDataCarencia(Date dataCarencia) {
        DataCarencia = dataCarencia;
    }
}
