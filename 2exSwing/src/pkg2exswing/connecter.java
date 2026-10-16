/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2exswing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yassi
 */
public class connecter {
    Connection con ;

    public connecter() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.err.println(e);
        }
        
        try{
          con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/formulaire","root","");
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }
    
    Connection obtenirconnexion(){
        return con ;
    }
}
