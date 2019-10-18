/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author apalencia
 */

@Configuration
@Entity

public class VSgpVendedoresActivos implements Serializable {

     
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigozona;
    private String nombrezona;
    private int codigocda;
    private String nombrecda;
    private long cedula;
    private String nombres;
    private short codigomodalidad;
    private String nombremodalidad;
    private Short grupoplan;
    private String nombregrupoplan;
    private String fechainicio;
    private String loginusuario;

    public VSgpVendedoresActivos() {
    }

    public int getCodigozona() {
        return codigozona;
    }

    public void setCodigozona(int codigozona) {
        this.codigozona = codigozona;
    }

    public String getNombrezona() {
        return nombrezona;
    }

    public void setNombrezona(String nombrezona) {
        this.nombrezona = nombrezona;
    }

    public int getCodigocda() {
        return codigocda;
    }

    public void setCodigocda(int codigocda) {
        this.codigocda = codigocda;
    }

    public String getNombrecda() {
        return nombrecda;
    }

    public void setNombrecda(String nombrecda) {
        this.nombrecda = nombrecda;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public short getCodigomodalidad() {
        return codigomodalidad;
    }

    public void setCodigomodalidad(short codigomodalidad) {
        this.codigomodalidad = codigomodalidad;
    }

    public String getNombremodalidad() {
        return nombremodalidad;
    }

    public void setNombremodalidad(String nombremodalidad) {
        this.nombremodalidad = nombremodalidad;
    }

    public Short getGrupoplan() {
        return grupoplan;
    }

    public void setGrupoplan(Short grupoplan) {
        this.grupoplan = grupoplan;
    }

    public String getNombregrupoplan() {
        return nombregrupoplan;
    }

    public void setNombregrupoplan(String nombregrupoplan) {
        this.nombregrupoplan = nombregrupoplan;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getLoginusuario() {
        return loginusuario;
    }

    public void setLoginusuario(String loginusuario) {
        this.loginusuario = loginusuario;
    }
    
}
