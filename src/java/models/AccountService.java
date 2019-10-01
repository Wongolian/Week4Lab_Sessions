/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Steven
 */
public class AccountService {

    private final String[] USERNAMES = {"adam", "betty"};
    private final String[] PASSWORDS = {"password", "password"};

    public Users login(String username, String password) {
        
        for (int i = 0; i < PASSWORDS.length; i++) {
            
            if (username.equalsIgnoreCase(USERNAMES[i]) && password.equals(PASSWORDS[i])) {
                
                return new Users(username, null);
            }
        }
        
        return null;
    }

}
