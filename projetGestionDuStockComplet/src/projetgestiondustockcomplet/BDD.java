/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgestiondustockcomplet;
import java.net.Socket;

import java.sql.*;


/**
 *
 * @author yassi
 */
public class BDD {
    Connection connection ;
    Statement statement ;
    String SQL ;
    String url ;
    String username ;
    String password ;
    Socket client ;
    int port ;
    String Host ;
    


    public BDD(String HOSTDB, String USERNAME_DB, String PASSWORD_DB, String IPHOST, int PORT) {
       this.Host=HOSTDB;
       this.username=USERNAME_DB;
       this.password=PASSWORD_DB;
       this.url=IPHOST;
       this.port=PORT;
    }

  
    //ouvrir db
    public Connection connexionDatabase (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(url,username,password);
        }catch(Exception e){
        System.err.println(e.getMessage());}
        return connection ;
    }
    //close db 
    public Connection closeDatabase(){
        try{
            connection.close();
        }catch(Exception e){
            System.err.println(e.getMessage()); 
        }
    return connection ;
    }
    
    public ResultSet executionQuery(String sql){
        connexionDatabase();
        ResultSet resultset =null ;
        try{
            statement=(Statement) connection.createStatement();
            resultset=statement.executeQuery(sql);
        }catch(SQLException ex ){System.err.println(ex);}
        return resultset ;
    }
    //execution requete 
      public String executionUpdate(String sql){
        connexionDatabase();
        String result ="";
        
        try{
            statement=(Statement) connection.createStatement();
            statement.executeUpdate(sql);
            result=sql ;
        }catch(SQLException ex ){result=ex.toString();}
       return result ;   
    }
      //affichage
      public ResultSet querySelectAll(String nomTable){
          connexionDatabase() ;
          SQL =" SELECT * FROM " + nomTable;
          System.out.println(SQL);
          return this.executionQuery(SQL);
      }
      
      //affichage avec parametres
       public ResultSet querySelectAll(String nomTable,String etat){
          connexionDatabase() ;
          SQL =" SELECT * FROM "+nomTable +" WHERE "+ etat;
          System.out.println(SQL);
          return this.executionQuery(SQL);
      }
       
       public ResultSet querySelect(String[] nomColomne ,String nomTable){
           connexionDatabase() ;
           int i ;
           SQL =" SELECT ";
           for(i =0;i<=nomColomne.length-1;i++){
               SQL +=nomColomne[i];
               if(i<nomColomne.length-1){
                   SQL+=" , ";
                   
               }
           }
           SQL +=" FROM "+nomTable ;
           return this.executionQuery(SQL);
       } 
       
       public ResultSet fcSelectCommand(String[] nomColomne ,String nomTable ,String etat){
           connexionDatabase() ;
           int i ;
           SQL =" SELECT " ;
             for(i =0;i<=nomColomne.length-1;i++){
               SQL +=nomColomne[i];
               if(i<nomColomne.length-1){
                   SQL+=" , ";
                   
               }
           }
           SQL +=" FROM "+nomTable +" WHERE "+etat ;
           return this.executionQuery(SQL);
           
       }
       public String insertQuery(String nomTable ,String[] contenuTable){
           connexionDatabase() ;
           int i ;
           SQL =" INSERT INTO "+nomTable +" VALUES " ;
           for(i=0;i<contenuTable.length-1;i++){
               SQL+=" ' "+  contenuTable[i]+" ' " ;
               if(i<contenuTable.length-1){
                   SQL+=" , " ;
               }
           }
           SQL+=" ) ";
           return this.executionUpdate(SQL);
       }
         public String insertQuery(String nomTable , String[] nomCOlomne ,String[] contenuTable){
           connexionDatabase() ;
           int i ;
           SQL =" INSERT INTO "+nomTable +" ( " ;
           for(i=0;i<nomCOlomne.length-1;i++){
               SQL+= nomCOlomne[i];
               if(i<nomCOlomne.length-1){
                   SQL+=" , " ;
               }
               
           }
           SQL+=" ) VALUES( ";
             for(i=0;i<contenuTable.length-1;i++){
               SQL+=" ' "+  contenuTable[i]+" ' " ;
               if(i<contenuTable.length-1){
                   SQL+=" , " ;
               }
             }
             SQL +=" ) ";
            return this.executionUpdate(SQL);
       }
         public String queryUpdate(String nomTable , String[] nomCOlomne ,String[] contenuTable,String etat){
              connexionDatabase() ;
           int i ;
           SQL =" UPDATE "+nomTable+" SET " ;
           for(i=0;i<nomCOlomne.length-1;i++){
               SQL+= nomCOlomne[i]+" '= "+contenuTable[i]+" ' ";
               if(i<nomCOlomne.length-1){
                   SQL+=" , " ;
               }
               
           }
           SQL+=" WHERE "+etat;
           
           return this.executionUpdate(SQL);
         }
         public String queryDelete(String nomtable){
             connexionDatabase();
             SQL+=" DELETE FROM "+ nomtable ;
             return this.executionUpdate(SQL);
         }
          public String queryDelete(String nomtable,String etat){
             connexionDatabase();
             SQL+=" DELETE FROM "+ nomtable +" WHERE "+etat ;
             return this.executionUpdate(SQL);
         }
}
