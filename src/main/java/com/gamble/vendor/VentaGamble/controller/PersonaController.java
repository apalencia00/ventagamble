/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.controller;

import com.gamble.vendor.VentaGamble.entity.Personas;
import com.gamble.vendor.VentaGamble.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author apalencia
 */
@RestController
@RequestMapping("/api/person")
public class PersonaController {
    
    @Autowired
    PersonaService personaService;
    
    @GetMapping(value = "personas")
    public List<Personas> listarPersonas(){
            
        return personaService.obtenerTodasPersonas();
    }
    
    @RequestMapping("nombre")
    public String getNombre(@RequestParam(name = "doc") String doc) {
            
        return personaService.traerNombre(doc);
        
    }
    
    
}
