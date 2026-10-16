/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author yassi
 */
public class Connecter {
    Connection con ;

    public Connecter() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.err.println(e);
        }
        
        try{
          con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/etudiant","root","");
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
    Connection obtenirconnexion(){
        return con ;
    }
    
}
