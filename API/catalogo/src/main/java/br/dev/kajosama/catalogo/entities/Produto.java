/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.kajosama.catalogo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Sam_Umbra
 */

@Entity
@Table(name = "products")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private long productId;
    
    @Column(name = "productname")
    private String productName;
    private String description;
    private double price;
    private String category;
    
    @Column(name = "imageurl")
    private String imageUrl;
    
    @Column(name = "supplierid")
    private long supplierId;
    
    private int evaluation;

    public Produto() {
    }

    public Produto(long productId, String productName, String description, double price, String category, String imageUrl, long supplierId, int evaluation) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
        this.supplierId = supplierId;
        this.evaluation = evaluation;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long id) {
        this.productId = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }
    
    
}
