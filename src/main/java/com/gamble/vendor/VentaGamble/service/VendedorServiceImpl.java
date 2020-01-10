/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamble.vendor.VentaGamble.service;

import com.gamble.vendor.VentaGamble.entity.VSgpVendedoresActivos;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gamble.vendor.VentaGamble.repository.VendedorRepository;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author apalencia
 */

@Service
@Transactional
public class VendedorServiceImpl implements VendedorService {
    
    private final Path rootLocation = Paths.get("/home/aplicaciones/upload-dir");
    
    
    @Autowired
    private VendedorRepository vendedorRepository;

    @Override
    public void guardar(VSgpVendedoresActivos vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VSgpVendedoresActivos> obtenerTodosVendedores() {
       return vendedorRepository.findAll();
    }

    @Override
    public Optional<VSgpVendedoresActivos> obtenerVendedor(Long id) {
       return vendedorRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VSgpVendedoresActivos obtenerVendedorByDocumento(String doc) {
        return vendedorRepository.findVendedorByDocumento(doc);
    }

    @Override
    public void subirMasivo(MultipartFile file) {
        
          try 
          {
            Files.copy(file.getInputStream(), this.rootLocation.resolve(file.getOriginalFilename()));

          } catch (IOException ex) {
             ex.fillInStackTrace();
          }
        
    }
    
    
    
}
