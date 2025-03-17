/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.dev.kajosama.catalogo.repositories;

import br.dev.kajosama.catalogo.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sam_Umbra
 */
public interface CatalogoRepository extends JpaRepository<Produto, Long>{
    
}
