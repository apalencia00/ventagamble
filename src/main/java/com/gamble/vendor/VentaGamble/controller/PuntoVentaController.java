/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.controller;

import com.gamble.vendor.VentaGamble.entity.VSgpZonavscdavspuntos;
import com.gamble.vendor.VentaGamble.service.PuntoVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author apalencia
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/punto")
public class PuntoVentaController {
    
    @Autowired
    PuntoVentaService puntoVentaService;
    
    @GetMapping(value = "puntoinfo/{codigo}")
    public VSgpZonavscdavspuntos puntoInfo(@PathVariable String codigo ) {
            
        return puntoVentaService.obtenerPuntoVentaByCodigo(codigo);
    }
    
}
