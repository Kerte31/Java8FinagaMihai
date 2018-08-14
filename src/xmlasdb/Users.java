/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlasdb;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Mihai
 */
public class Users {
    private ArrayList<User> user;

    public Users() {
    }

    public Users(ArrayList<User> user) {
        this.user = user;
    }

    @XmlElement
    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Users{" + "user=" + user + '}';
    }

    public void addUser(String username, String password, String role) {
        user.add(new User(username,password,role));
    }
}
