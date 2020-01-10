/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.repository;

import com.gamble.vendor.VentaGamble.entity.VSgpZonavscdavspuntos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author apalencia
 */

@Repository
public interface PuntoVentaRepository extends CrudRepository<VSgpZonavscdavspuntos, Long> {
    
    
    @Query(value = "SELECT V.* FROM NOMINA.V_SGP_CONSULTAZONAVSCDAVSPUNTO V WHERE V.CODIGOPUNTO = ?1", nativeQuery = true)
    public VSgpZonavscdavspuntos findPuntoVentaByCodigoZona(@Param("codigo") String codigo );
    
    

    
}
