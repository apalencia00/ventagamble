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

public class VSgpZonavscdavspuntos {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGOZONA")
    @Id
    private int codigozona;
    @Size(max = 4000)
    @Column(name = "NOMBREZONA")
    private String nombrezona;
    @Size(max = 5)
    @Column(name = "CODIGODANECDA")
    private String codigodanecda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGOCDA")
    private int codigocda;
    @Size(max = 4000)
    @Column(name = "NOMBRECDA")
    private String nombrecda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGOPUNTO")
    private int codigopunto;
    @Size(max = 4000)
    @Column(name = "NOMBREPUNTO")
    private String nombrepunto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "FECHAFINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinal;

    public VSgpZonavscdavspuntos() {
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

    public String getCodigodanecda() {
        return codigodanecda;
    }

    public void setCodigodanecda(String codigodanecda) {
        this.codigodanecda = codigodanecda;
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

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }
    
}
