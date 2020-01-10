/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.service;

import com.gamble.vendor.VentaGamble.entity.VSgpVendedoresActivos;
import java.util.List;
import java.util.Optional;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author apalencia
 */
public interface VendedorService {
    
    
       /**
    
	 * Guarda el vendedor
	 * 
	 * @param vendedor
	 */
	void guardar(VSgpVendedoresActivos vendedor);
	
	/**
	 * Recupera la lista completa de votantes
	 * 
	 * @return
	 */
	List<VSgpVendedoresActivos> obtenerTodosVendedores();
	
	/**
	 * Devuelve el producto correspondiente al id si existe
	 * 
	 * @param id Id del producto
	 * @return
	 */
	Optional<VSgpVendedoresActivos> obtenerVendedor(Long id);
        
        VSgpVendedoresActivos obtenerVendedorByDocumento(String doc);
	
	/**
	 * Elimina el producto correspondiente al id
	 * 
	 * @param id Id del producto
	 */
	void eliminar(Integer id);
        
        void subirMasivo(MultipartFile file);
        
    
    
}
