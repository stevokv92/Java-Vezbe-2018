/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.User;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author stevokv
 */
public class StorageUser {
    private List<User> users;

    public StorageUser() {
        users = new ArrayList<>();
        users.add(new User(1L, "pera", "pera123", "Petar", "Peric", "pera@gmail.com"));
        users.add(new User(2L, "zika", "zika123", "Zika", "Zikic", "zika@gmail.com"));
    }
    
    public List<User> getUsers(){
        return users;
    }
    
    
}
