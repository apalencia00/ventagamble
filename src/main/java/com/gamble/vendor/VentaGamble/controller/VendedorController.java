/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.controller;

import com.gamble.vendor.VentaGamble.entity.VSgpVendedoresActivos;
import com.gamble.vendor.VentaGamble.service.VendedorService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    
    @PostMapping(value = "subida")
    private String subidaMasivaVotantes(@RequestParam("file") MultipartFile file,
            RedirectAttributes redirectAttributes) throws IOException{
        
         if (!file.isEmpty()) {
             
             File myfile = new File("/home/aplicaciones/upload-dir/"+file.getOriginalFilename());
             
            if ( !myfile.exists() ) {
             
                vendedorService.subirMasivo(file);
                redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded " + file.getOriginalFilename() + "!");

                FileInputStream fileinput = (FileInputStream) file.getInputStream();
               
                return "Archivo " + file.getOriginalFilename() + " subido con exito!";
        
         }else{
             
           return "Error, al parecer el archivo " + file.getOriginalFilename() + "ya existe" ;
             
         }

         }
        
        return "Error, el archivo esta vacio, o esta corrupto";
        
    }
    
    
    
}
