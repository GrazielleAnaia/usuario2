package com.grazielleanaia.usuario2.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Builder;


@Entity
@Table(name = "telefone")
@Builder

public class Telefone {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "ddd")
    private String ddd;

    @Column(name = "usuario_id")
    private Long usuario_id;

    public Telefone() {
    }


    public Telefone(Long id, String numero, String ddd, Long usuario_id) {
        this.id = id;
        this.numero = numero;
        this.ddd = ddd;
        this.usuario_id = usuario_id;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
}
