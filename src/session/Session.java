/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import domain.User;
/**
 *
 * @author stevokv
 */
public class Session {
    private static User currentUser;
    
    public static User getCurrentUser(){
        return currentUser;
    }
    
    public static void setCurrentUser(User currentUser){
        Session.currentUser = currentUser;            
    }
    
}
