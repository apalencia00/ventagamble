/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.service;

import com.gamble.vendor.VentaGamble.entity.Personas;
import java.util.List;

/**
 *
 * @author apalencia
 */
public interface PersonaService {
    
     /**
    
     * Guarda la persona
	 * 
	 * @param persona
	 */
	void guardar(Personas persona);
	
	/**
	 * Recupera la lista completa de votantes
	 * 
	 * @return
	 */
	List<Personas> obtenerTodasPersonas();
        
        String traerNombre(String doc);
    
    
    
}
