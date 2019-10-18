/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.service;

import com.gamble.vendor.VentaGamble.entity.VSgpZonavscdavspuntos;
import com.gamble.vendor.VentaGamble.repository.PuntoVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apalencia
 */
@Service
@Transactional
public class PuntoVentaServiceImpl implements PuntoVentaService {
    
    @Autowired
    PuntoVentaRepository puntoVentaRepository;

    @Override
    public VSgpZonavscdavspuntos obtenerPuntoVentaByCodigo(String codigo) {
        return puntoVentaRepository.findPuntoVentaByCodigoZona(codigo);
    }
    
}
