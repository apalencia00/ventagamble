/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.controller;

import com.gamble.vendor.VentaGamble.entity.VSgpVendedoresActivos;
import com.gamble.vendor.VentaGamble.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author apalencia
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/vendor")
public class VendedorController {
    
    @Autowired
    VendedorService vendedorService;
    
   
    
    
    @GetMapping(value = "hola")
    public String helloWorld() {

        return "Hola Mundo.. Bienvenido a esta Aplicacion de Andres Palencia Forez";        
    }
    
    @GetMapping(value = "vendedores")
    public java.util.List<VSgpVendedoresActivos> listarVendedores(){
        
        return vendedorService.obtenerTodosVendedores();
        
    }
    
    @GetMapping(value = "info/{doc}")
    @ResponseBody
    public VSgpVendedoresActivos infoVendedores(@PathVariable String doc){
            System.out.println(""+vendedorService.obtenerVendedorByDocumento(doc).getNombres());
        return vendedorService.obtenerVendedorByDocumento(doc);
        
    }
    
    
    
}
