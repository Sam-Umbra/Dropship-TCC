/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.kajosama.catalogo.service;

import br.dev.kajosama.catalogo.entities.Produto;
import br.dev.kajosama.catalogo.repositories.CatalogoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sam_Umbra
 */
@Service
public class CatalogoService {
    
    @Autowired
    private CatalogoRepository catalogoRepository;
    
    public List<Produto> findAll() {
        
        List<Produto> result = catalogoRepository.findAll();
        return result;
        
    }
    
}
