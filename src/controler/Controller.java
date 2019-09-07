/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import domain.User;
import domain.Manufacturer;
import storage.StorageUser;
import storage.StorageProduct;
import storage.StorageManufacturer;

import java.util.List;
/**
 *
 * @author stevokv
 */
public class Controller {
    private StorageUser storageUser;
    private StorageProduct storageProduct;
    private StorageManufacturer storageManufacturer;

    public Controller() {
        storageUser = new StorageUser();
        storageProduct = new StorageProduct();
        storageManufacturer = new StorageManufacturer();
    }
    
    public User logIn(String username, String password) throws Exception{
        List<User> users = storageUser.getUsers();
        for(User user: users){
            if(user.getUsername().equals(username)){
                if(user.getPassword().equals(password)){
                    return user;
                } else {
                    throw new Exception("Pogresna lozinka!");
                }
            }
        }
        throw new Exception("Ne postoji korisnik sa unetim korisnickim imenom!");
    }
    
    public List<Manufacturer> getAllManufacturers(){
        return storageManufacturer.getAll();
    }
}
