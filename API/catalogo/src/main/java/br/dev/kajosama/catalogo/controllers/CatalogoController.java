/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.kajosama.catalogo.controllers;

import br.dev.kajosama.catalogo.entities.Produto;
import br.dev.kajosama.catalogo.service.CatalogoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sam_Umbra
 */

@RestController
public class CatalogoController {
    
    @Autowired
    private CatalogoService catalogoService;
    
    /**
     * Endpoint /catalogo/products
     * Retorna TODOS os produtos do Catalogo/DB products
     * @return
     */
    @GetMapping("/products")
    public ResponseEntity<List<Produto>> findAll() {
        List<Produto> result = catalogoService.findAll();
        
        if (result.isEmpty()) {
            // notFound
            // Error 404
            return ResponseEntity.notFound().build();
            
        } else {
            // OK
            // 200
            return ResponseEntity.ok(result);
        }
    }
    
}
