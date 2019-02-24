/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodfinder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Foodfinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Connection conobj=null;
    Statement statobj=null;
    ResultSet resobj=null;
    String query="SELECT * FROM ARTHI.USERS";
    try{
        conobj=DriverManager.getConnection("jdbc:derby://localhost:1527/FoodFinder", "arthi", "password");
        statobj=conobj.createStatement();
        resobj=statobj.executeQuery(query);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
    
}
