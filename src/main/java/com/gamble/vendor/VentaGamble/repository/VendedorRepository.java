/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.repository;

import com.gamble.vendor.VentaGamble.entity.VSgpVendedoresActivos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author apalencia
 */

@Repository
public interface VendedorRepository extends CrudRepository<VSgpVendedoresActivos, Long> {
    
    @Override
    @Query(value = "SELECT * FROM NOMINA.V_SGP_VENDEDORES_ACTIVOS", nativeQuery = true)
    java.util.List<VSgpVendedoresActivos>findAll();
    
    @Query(value = "SELECT * FROM NOMINA.V_SGP_VENDEDORES_ACTIVOS WHERE CEDULA = ?1", nativeQuery = true)
    public VSgpVendedoresActivos findVendedorByDocumento(@Param("doc") String doc);
    
}
