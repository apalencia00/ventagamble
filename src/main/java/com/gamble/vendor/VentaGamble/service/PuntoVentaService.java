/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.service;

import com.gamble.vendor.VentaGamble.entity.VSgpZonavscdavspuntos;

/**
 *
 * @author apalencia
 */


public interface PuntoVentaService {
    
    VSgpZonavscdavspuntos obtenerPuntoVentaByCodigo(String codigo);
    
    
}
