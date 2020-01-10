/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apalencia
 */
@Entity

public class VSgpZonavscdavspuntos implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigozona;
    private String nombrezona;
    private int codigocda;
    private String nombrecda;
    private int codigopunto;
    private String nombrepunto;
    private java.sql.Date fechainicio;
    private java.sql.Date fechafinal;
    private String codigodane;
    private String nombrepuntoalterno;
    private String tipopunto;
    
    

    public VSgpZonavscdavspuntos() {
    }

    public VSgpZonavscdavspuntos(int codigozona, String nombrezona, int codigocda, String nombrecda, int codigopunto, String nombrepunto, java.sql.Date fechainicio, java.sql.Date fechafinal, String codigodane, String nombrepuntoalterno, String tipopunto) {
        this.codigozona = codigozona;
        this.nombrezona = nombrezona;
        this.codigocda = codigocda;
        this.nombrecda = nombrecda;
        this.codigopunto = codigopunto;
        this.nombrepunto = nombrepunto;
        this.fechainicio = fechainicio;
        this.fechafinal = fechafinal;
        this.codigodane = codigodane;
        this.nombrepuntoalterno = nombrepuntoalterno;
        this.tipopunto = tipopunto;
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

    public int getCodigopunto() {
        return codigopunto;
    }

    public void setCodigopunto(int codigopunto) {
        this.codigopunto = codigopunto;
    }

    public String getNombrepunto() {
        return nombrepunto;
    }

    public void setNombrepunto(String nombrepunto) {
        this.nombrepunto = nombrepunto;
    }

    public java.sql.Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(java.sql.Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public java.sql.Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(java.sql.Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public String getCodigodane() {
        return codigodane;
    }

    public void setCodigodane(String codigodane) {
        this.codigodane = codigodane;
    }

    public String getNombrepuntoalterno() {
        return nombrepuntoalterno;
    }

    public void setNombrepuntoalterno(String nombrepuntoalterno) {
        this.nombrepuntoalterno = nombrepuntoalterno;
    }

    public String getTipopunto() {
        return tipopunto;
    }

    public void setTipopunto(String tipopunto) {
        this.tipopunto = tipopunto;
    }

   

   
    
}
