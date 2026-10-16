/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtp3;

/**
 *
 * @author yassi
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    private static Connection con;
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver OK");
            String url = "jdbc:postgresql://localhost:5432/catalogue";
            String user = "java";
            String pwd = "java";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogue","root","");
            System.out.println("Connection OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        return con;
    }
}