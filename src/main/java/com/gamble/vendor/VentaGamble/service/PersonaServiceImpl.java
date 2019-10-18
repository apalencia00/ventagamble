/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.service;

import com.gamble.vendor.VentaGamble.entity.Personas;
import com.gamble.vendor.VentaGamble.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apalencia
 */
@Service
@Transactional
public class PersonaServiceImpl implements PersonaService {
    
     @Autowired
    private PersonaRepository personaRepository;

    @Override
    public void guardar(Personas persona) {
        personaRepository.save(persona);
    }

    @Override
    public List<Personas> obtenerTodasPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public String traerNombre(String doc) {
        return personaRepository.find(doc);
    }
    
    
    
}
