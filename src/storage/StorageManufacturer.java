/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Manufacturer;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author stevokv
 */
public class StorageManufacturer {
    private List<Manufacturer> manufacturers;

    public StorageManufacturer() {
        manufacturers = new LinkedList<>();
        manufacturers.add(new Manufacturer(1L, "Manufacturer-1"));
        manufacturers.add(new Manufacturer(2L, "Manufacturer-2"));
    }

    public List<Manufacturer> getAll() {
        return manufacturers;
    }
    
    
    
    
}
