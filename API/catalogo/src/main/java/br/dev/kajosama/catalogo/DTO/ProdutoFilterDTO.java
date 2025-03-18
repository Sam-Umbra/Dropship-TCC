/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.kajosama.catalogo.DTO;

import br.dev.kajosama.catalogo.entities.Produto;

/**
 *
 * @author Sam_Umbra
 */
public class ProdutoFilterDTO {
    
    private long productId;
    private String productName;
    private String imageUrl;
    private double price;

    public ProdutoFilterDTO() {
    }

    public ProdutoFilterDTO(Produto produto) {
        this.productId = produto.getProductId();
        this.productName = produto.getProductName();
        this.imageUrl = produto.getImageUrl();
        this.price = produto.getPrice();
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getPrice() {
        return price;
    }
     
}
