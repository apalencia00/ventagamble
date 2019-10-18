/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author apalencia
 */
@Entity

public class Personas implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    private Long documento;

    private short trtrioTpotrtCodigexpedidoEn;

    private short trtrioTpotrtCodigpenacidoEn;

    private short trtrioTpotrtCodigperteneceA;

    private int ubcpotrtrioCodigoPenacidoEn;

    private int ubcpotrtrioCodigoPerteneceA;

    private int ubcpolTrtrioCodigexpedidoEn;

    private short datDtoCodigo;

    private short datDtoCodigoSexoPara;

    private short ubcpolTrtrioTpotrtCodigo;

    private int ubcpolTrtrioCodigo;

    private int ubcpolTrtrioCodigoNacidoEn;

    private short ubcpolTrtrioTpotrexpedidoEn;

    private int ubcpotrtrioCodigoExpedidoEn;

    private short datEntCodigo;

    private short datEntCodigoSexoPara;

    private short ubcpolTrtrioTpotrtNacidoEn;

    private String nombres;


    private String apellido1;

    private Date fechanacimiento;

    private String telefono;

    private Date fechaingreso;

    private Date fechasys;

    private String apellido2;

    private String direccion;

    private String foto;

    private String observacion;


    private String documento2;

    private Short datTipodoc2;

    private Short entTipodoc2;

    private BigInteger version;

    private Long planliquidacion;

    private Character activo;

    private Date fechaExpedicion;

    private String ocupacion;

    private Character empleadoPublico;

    private Character personaExpuesta;

    private Character famipersonaExpuesta;

    private String celular;

    private String correo;

    private String nombre1;

    private String nombre2;

    public Personas() {
    }

    public Personas(Long documento) {
        this.documento = documento;
    }

    public Personas(Long documento, short trtrioTpotrtCodigexpedidoEn, short trtrioTpotrtCodigpenacidoEn, short trtrioTpotrtCodigperteneceA, int ubcpotrtrioCodigoPenacidoEn, int ubcpotrtrioCodigoPerteneceA, int ubcpolTrtrioCodigexpedidoEn, short datDtoCodigo, short datDtoCodigoSexoPara, short ubcpolTrtrioTpotrtCodigo, int ubcpolTrtrioCodigo, int ubcpolTrtrioCodigoNacidoEn, short ubcpolTrtrioTpotrexpedidoEn, int ubcpotrtrioCodigoExpedidoEn, short datEntCodigo, short datEntCodigoSexoPara, short ubcpolTrtrioTpotrtNacidoEn, String nombres, String apellido1, Date fechanacimiento, String telefono, Date fechaingreso, Date fechasys) {
        this.documento = documento;
        this.trtrioTpotrtCodigexpedidoEn = trtrioTpotrtCodigexpedidoEn;
        this.trtrioTpotrtCodigpenacidoEn = trtrioTpotrtCodigpenacidoEn;
        this.trtrioTpotrtCodigperteneceA = trtrioTpotrtCodigperteneceA;
        this.ubcpotrtrioCodigoPenacidoEn = ubcpotrtrioCodigoPenacidoEn;
        this.ubcpotrtrioCodigoPerteneceA = ubcpotrtrioCodigoPerteneceA;
        this.ubcpolTrtrioCodigexpedidoEn = ubcpolTrtrioCodigexpedidoEn;
        this.datDtoCodigo = datDtoCodigo;
        this.datDtoCodigoSexoPara = datDtoCodigoSexoPara;
        this.ubcpolTrtrioTpotrtCodigo = ubcpolTrtrioTpotrtCodigo;
        this.ubcpolTrtrioCodigo = ubcpolTrtrioCodigo;
        this.ubcpolTrtrioCodigoNacidoEn = ubcpolTrtrioCodigoNacidoEn;
        this.ubcpolTrtrioTpotrexpedidoEn = ubcpolTrtrioTpotrexpedidoEn;
        this.ubcpotrtrioCodigoExpedidoEn = ubcpotrtrioCodigoExpedidoEn;
        this.datEntCodigo = datEntCodigo;
        this.datEntCodigoSexoPara = datEntCodigoSexoPara;
        this.ubcpolTrtrioTpotrtNacidoEn = ubcpolTrtrioTpotrtNacidoEn;
        this.nombres = nombres;
        this.apellido1 = apellido1;
        this.fechanacimiento = fechanacimiento;
        this.telefono = telefono;
        this.fechaingreso = fechaingreso;
        this.fechasys = fechasys;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public short getTrtrioTpotrtCodigexpedidoEn() {
        return trtrioTpotrtCodigexpedidoEn;
    }

    public void setTrtrioTpotrtCodigexpedidoEn(short trtrioTpotrtCodigexpedidoEn) {
        this.trtrioTpotrtCodigexpedidoEn = trtrioTpotrtCodigexpedidoEn;
    }

    public short getTrtrioTpotrtCodigpenacidoEn() {
        return trtrioTpotrtCodigpenacidoEn;
    }

    public void setTrtrioTpotrtCodigpenacidoEn(short trtrioTpotrtCodigpenacidoEn) {
        this.trtrioTpotrtCodigpenacidoEn = trtrioTpotrtCodigpenacidoEn;
    }

    public short getTrtrioTpotrtCodigperteneceA() {
        return trtrioTpotrtCodigperteneceA;
    }

    public void setTrtrioTpotrtCodigperteneceA(short trtrioTpotrtCodigperteneceA) {
        this.trtrioTpotrtCodigperteneceA = trtrioTpotrtCodigperteneceA;
    }

    public int getUbcpotrtrioCodigoPenacidoEn() {
        return ubcpotrtrioCodigoPenacidoEn;
    }

    public void setUbcpotrtrioCodigoPenacidoEn(int ubcpotrtrioCodigoPenacidoEn) {
        this.ubcpotrtrioCodigoPenacidoEn = ubcpotrtrioCodigoPenacidoEn;
    }

    public int getUbcpotrtrioCodigoPerteneceA() {
        return ubcpotrtrioCodigoPerteneceA;
    }

    public void setUbcpotrtrioCodigoPerteneceA(int ubcpotrtrioCodigoPerteneceA) {
        this.ubcpotrtrioCodigoPerteneceA = ubcpotrtrioCodigoPerteneceA;
    }

    public int getUbcpolTrtrioCodigexpedidoEn() {
        return ubcpolTrtrioCodigexpedidoEn;
    }

    public void setUbcpolTrtrioCodigexpedidoEn(int ubcpolTrtrioCodigexpedidoEn) {
        this.ubcpolTrtrioCodigexpedidoEn = ubcpolTrtrioCodigexpedidoEn;
    }

    public short getDatDtoCodigo() {
        return datDtoCodigo;
    }

    public void setDatDtoCodigo(short datDtoCodigo) {
        this.datDtoCodigo = datDtoCodigo;
    }

    public short getDatDtoCodigoSexoPara() {
        return datDtoCodigoSexoPara;
    }

    public void setDatDtoCodigoSexoPara(short datDtoCodigoSexoPara) {
        this.datDtoCodigoSexoPara = datDtoCodigoSexoPara;
    }

    public short getUbcpolTrtrioTpotrtCodigo() {
        return ubcpolTrtrioTpotrtCodigo;
    }

    public void setUbcpolTrtrioTpotrtCodigo(short ubcpolTrtrioTpotrtCodigo) {
        this.ubcpolTrtrioTpotrtCodigo = ubcpolTrtrioTpotrtCodigo;
    }

    public int getUbcpolTrtrioCodigo() {
        return ubcpolTrtrioCodigo;
    }

    public void setUbcpolTrtrioCodigo(int ubcpolTrtrioCodigo) {
        this.ubcpolTrtrioCodigo = ubcpolTrtrioCodigo;
    }

    public int getUbcpolTrtrioCodigoNacidoEn() {
        return ubcpolTrtrioCodigoNacidoEn;
    }

    public void setUbcpolTrtrioCodigoNacidoEn(int ubcpolTrtrioCodigoNacidoEn) {
        this.ubcpolTrtrioCodigoNacidoEn = ubcpolTrtrioCodigoNacidoEn;
    }

    public short getUbcpolTrtrioTpotrexpedidoEn() {
        return ubcpolTrtrioTpotrexpedidoEn;
    }

    public void setUbcpolTrtrioTpotrexpedidoEn(short ubcpolTrtrioTpotrexpedidoEn) {
        this.ubcpolTrtrioTpotrexpedidoEn = ubcpolTrtrioTpotrexpedidoEn;
    }

    public int getUbcpotrtrioCodigoExpedidoEn() {
        return ubcpotrtrioCodigoExpedidoEn;
    }

    public void setUbcpotrtrioCodigoExpedidoEn(int ubcpotrtrioCodigoExpedidoEn) {
        this.ubcpotrtrioCodigoExpedidoEn = ubcpotrtrioCodigoExpedidoEn;
    }

    public short getDatEntCodigo() {
        return datEntCodigo;
    }

    public void setDatEntCodigo(short datEntCodigo) {
        this.datEntCodigo = datEntCodigo;
    }

    public short getDatEntCodigoSexoPara() {
        return datEntCodigoSexoPara;
    }

    public void setDatEntCodigoSexoPara(short datEntCodigoSexoPara) {
        this.datEntCodigoSexoPara = datEntCodigoSexoPara;
    }

    public short getUbcpolTrtrioTpotrtNacidoEn() {
        return ubcpolTrtrioTpotrtNacidoEn;
    }

    public void setUbcpolTrtrioTpotrtNacidoEn(short ubcpolTrtrioTpotrtNacidoEn) {
        this.ubcpolTrtrioTpotrtNacidoEn = ubcpolTrtrioTpotrtNacidoEn;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Date getFechasys() {
        return fechasys;
    }

    public void setFechasys(Date fechasys) {
        this.fechasys = fechasys;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDocumento2() {
        return documento2;
    }

    public void setDocumento2(String documento2) {
        this.documento2 = documento2;
    }

    public Short getDatTipodoc2() {
        return datTipodoc2;
    }

    public void setDatTipodoc2(Short datTipodoc2) {
        this.datTipodoc2 = datTipodoc2;
    }

    public Short getEntTipodoc2() {
        return entTipodoc2;
    }

    public void setEntTipodoc2(Short entTipodoc2) {
        this.entTipodoc2 = entTipodoc2;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    public Long getPlanliquidacion() {
        return planliquidacion;
    }

    public void setPlanliquidacion(Long planliquidacion) {
        this.planliquidacion = planliquidacion;
    }

    public Character getActivo() {
        return activo;
    }

    public void setActivo(Character activo) {
        this.activo = activo;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Character getEmpleadoPublico() {
        return empleadoPublico;
    }

    public void setEmpleadoPublico(Character empleadoPublico) {
        this.empleadoPublico = empleadoPublico;
    }

    public Character getPersonaExpuesta() {
        return personaExpuesta;
    }

    public void setPersonaExpuesta(Character personaExpuesta) {
        this.personaExpuesta = personaExpuesta;
    }

    public Character getFamipersonaExpuesta() {
        return famipersonaExpuesta;
    }

    public void setFamipersonaExpuesta(Character famipersonaExpuesta) {
        this.famipersonaExpuesta = famipersonaExpuesta;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    
    
}
