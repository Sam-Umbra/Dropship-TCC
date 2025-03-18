/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.kajosama.catalogo.service;

import br.dev.kajosama.catalogo.DTO.ProdutoFilterDTO;
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
    
    public List<ProdutoFilterDTO> findAll() {
        
        List<Produto> resultProduto = catalogoRepository.findAll();
        
        List<ProdutoFilterDTO> resultDTO = resultProduto.stream()
                .map(x -> new ProdutoFilterDTO(x)).toList();
        
        return resultDTO;
    }
    
    /**
     * Retorna os produtos filtrados pelo nome.
     * @param productName
     * @return 
     */
    public List<ProdutoFilterDTO> findByProductName(String productName) {
        List<Produto> resultProduto = catalogoRepository.findByProductNameIgnoreCaseContaining(productName);
        
        List<ProdutoFilterDTO> resultDTO = resultProduto.stream()
                .map(x -> new ProdutoFilterDTO(x)).toList();
        
        return resultDTO;
    }
    
    public List<ProdutoFilterDTO> findByCategory(String category) {
        List<Produto> resultProduto = catalogoRepository.findByCategoryIgnoreCase(category);
        
        List<ProdutoFilterDTO> resultDTO = resultProduto.stream()
                .map(x -> new ProdutoFilterDTO(x)).toList();
        
        return resultDTO;
    }
    
    public List<ProdutoFilterDTO> findByEvaluation(int evaluation) {
        List<Produto> resultProduto = catalogoRepository.findByEvaluation(evaluation);
        
        List<ProdutoFilterDTO> resultDTO = resultProduto.stream()
                .map(x -> new ProdutoFilterDTO(x)).toList();
        
        return resultDTO;
    }
    
    public List<ProdutoFilterDTO> findByPriceBetween(double firstPrice, double secondePrice) {
        List<Produto> resultProduto = catalogoRepository.findByPriceBetween(firstPrice, secondePrice);
        
        List<ProdutoFilterDTO> resultDTO = resultProduto.stream()
                .map(x -> new ProdutoFilterDTO(x)).toList();
        
        return resultDTO;
    }
}
