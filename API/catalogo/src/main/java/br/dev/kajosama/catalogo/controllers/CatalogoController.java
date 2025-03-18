/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.kajosama.catalogo.controllers;

import br.dev.kajosama.catalogo.DTO.ProdutoFilterDTO;
import br.dev.kajosama.catalogo.entities.Produto;
import br.dev.kajosama.catalogo.service.CatalogoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ResponseEntity<List<ProdutoFilterDTO>> findAll() {
        List<ProdutoFilterDTO> result = catalogoService.findAll();
        
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
    
    @GetMapping("/productName/{name}")
    public ResponseEntity<List<ProdutoFilterDTO>> findByProductNameIgnoreCaseContaining(@PathVariable String name) {
        
        List<ProdutoFilterDTO> result = catalogoService.findByProductName(name);
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
    
    @GetMapping("categories/{category}")
    public ResponseEntity<List<ProdutoFilterDTO>> findByCategoryIgnoreCase(@PathVariable String category) {
        
        List<ProdutoFilterDTO> result = catalogoService.findByCategory(category);
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping("evaluations/{evaluation}")
    public ResponseEntity<List<ProdutoFilterDTO>> findByEvaluation(@PathVariable int evaluation) {
        List<ProdutoFilterDTO> result = catalogoService.findByEvaluation(evaluation);
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping("/pricebetween")
    public ResponseEntity<List<ProdutoFilterDTO>> findByPriceBetween(
            @RequestParam String firstPrice,
            @RequestParam String secondPrice) {
        
        
        List<ProdutoFilterDTO> result = catalogoService.findByPriceBetween(Double.parseDouble(firstPrice), Double.parseDouble(secondPrice));
        
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
}
