/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.dev.kajosama.catalogo.repositories;

import br.dev.kajosama.catalogo.entities.Produto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sam_Umbra
 */
public interface CatalogoRepository extends JpaRepository<Produto, Long>{
    /**
     * O parametro tem que possuir o mesmo nome do atributo de sua classe referente que está sendo pesquisada.
     * findBy(nome do param)IgnoreCase(Ignora letras maiusculas e minusculas)Containing(procura tudo que contenha o param, não há necessidade de ser igual no db)
     * OBS: Ele tem problemas com acentuação, corrigir no FRONT
     * @param productName
     * @return 
     */
    List<Produto> findByProductNameIgnoreCaseContaining(String productName);
    
    List<Produto> findByCategoryIgnoreCase(String category);
    
    List<Produto> findByEvaluation(int evaluation);
    
    List<Produto> findByPriceBetween(double firstPrice, double secondPrice);
}
