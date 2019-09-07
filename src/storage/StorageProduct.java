/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Product;

import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author stevokv
 */
public class StorageProduct {
    private List<Product> products;

    public StorageProduct() {
        this.products = new LinkedList<>();
    }
    
    public void add(Product product){
        this.products.add(product);
    }
    
    public List<Product> getAll(){
        return products;
    }
    
    
}
