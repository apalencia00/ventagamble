/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.repository;

import com.gamble.vendor.VentaGamble.entity.Personas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author apalencia
 */
@Repository
public interface PersonaRepository extends CrudRepository<Personas, Long> {
    
    @Override
    @Query(value= "SELECT * FROM GAMBLE.PERSONAS", nativeQuery = true)
    public List<Personas> findAll();
    
    @Query(value="SELECT NOMBRES FROM GAMBLE.PERSONAS p WHERE p.DOCUMENTO = ?1",nativeQuery = true)
    public String find(@Param("doc") String doc);
    
}
