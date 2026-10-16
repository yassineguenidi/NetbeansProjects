/*/*8
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author yassi
 */
import java.sql.DriverManager ;
import java.sql.*;
import javax.swing.*;

class MysqlConnect {
Connection cnn=null ;
public static Connection ConnecrDb(){
    try{
        Class.forName("com.sql.jdbc.Driver");
        Connection cnn=DriverManager.getConnection("jdbc:http://localhost/phpmyadmin/db_structure.php?server=1&db=ihm","root","");
       JOptionPane.showMessageDialog(null, "connection established");
        return cnn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null ;
    }
}
}
