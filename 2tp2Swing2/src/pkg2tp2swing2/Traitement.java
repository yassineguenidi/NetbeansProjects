/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp2swing2;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pkg2tp2swing2.ConnectSql;

/**
 *
 * @author yassi
 */
public class Traitement {
   public void AjouterProduit(Produit p) {
        
        try{
            ConnectSql conn = new ConnectSql();
            Statement stm ;
            stm=conn.obtenirconnexion().createStatement();
            String requete = "insert into produit (id,libelle,prix)VALUES('"
                 +p.getId()+"','"+p.getLibelle()+"','"+p.getPrix()+"')";
            stm.executeUpdate(requete);
            
        }catch(Exception e){System.err.println(e);
            System.out.println(e);
            System.out.println("produit non ajouté");
        }
    }
    
   public List<Produit> produitParMC (String mc){
        try{
        ConnectSql conn = new ConnectSql();
        Statement stm ;
        stm=conn.obtenirconnexion().createStatement();
        ResultSet prod=stm.executeQuery("SELECT * FROM produit WHERE libelle='" +  mc+"'");
        List<Produit> p = new ArrayList();
        while(prod.next()){
            /*
            System.out.println(" Ref :" +prod.getInt("ref")+
                            " nom Produit : "+prod.getString("nomP")+
                            " description : "+prod.getString("descriptionP")+
                            " prix Unitaire : "+prod.getInt("prixUnitaireP")            
                    );
            */
            int id  =prod.getInt("id");
            String libelle = prod.getString("liblle");
            int prix =prod.getInt("prix");
            Produit product = new Produit( id , libelle ,prix ) ;
            
            p.add(product);
            }
            
             return p;
            
        }catch(Exception e){System.err.println(e);
            System.out.println(e);
            System.out.println("not connected");
            return null ;
        }
    }
    
   public Produit rechercherProduit(int id){
        try{
            ConnectSql conn = new ConnectSql();
            Statement stm ;
            ResultSet Rs ;
            stm=conn.obtenirconnexion().createStatement();
            ResultSet prod=stm.executeQuery("SELECT * FROM produit WHERE id='" +  id+"'");
            
            while(prod.next()){
                String libelle =prod.getString("libelle");
                int prix = prod.getInt("prix") ;
                Produit p = new Produit(id,libelle,prix);
                return p;
            }
            
            
            
            
        }catch(Exception e){System.err.println(e);
            System.out.println(e);
            System.out.println("not connected");
            
        }
        return null ;
    }
     
   public void modifierProduit(Produit p){
        try{
            ConnectSql conn = new ConnectSql();
            Statement stm ;
            stm=conn.obtenirconnexion().createStatement();
            stm.executeUpdate("UPDATE produit  SET libelle ='"+p.getLibelle()+"',prix='"+p.getPrix()
                    +"'WHERE id= "+p.getId());
            
            
        }catch(Exception e){System.err.println(e);
            System.out.println(e);
            System.out.println("not connected");
        }
        
    } 
    
   public void supprimerProduit(int id){
        try{
            ConnectSql conn = new ConnectSql();
            Statement stm ;
            stm=conn.obtenirconnexion().createStatement();
            String requete = "DELETE FROM produit where id="+ id;
            stm.executeUpdate(requete);
            
        }catch(Exception e){System.err.println(e);
            System.out.println(e);
            System.out.println("not connected");
        }
    }
    
   public List<Produit> getAll (){
        try{
        ConnectSql conn = new ConnectSql();
        Statement stm ;
        stm=conn.obtenirconnexion().createStatement();
        ResultSet prod=stm.executeQuery("SELECT * FROM produit");
        List<Produit> p = new ArrayList();
        while(prod.next()){
            int id  =prod.getInt("id");
            String libelle = prod.getString("libelle");
            int prix =prod.getInt("prix");
            Produit product = new Produit( id , libelle ,prix ) ;
            
            p.add(product);
            }
            
             return p;
            
        }catch(Exception e){System.err.println(e);
            System.out.println(e);
            System.out.println("not connected");
            return null ;
        }
    }
    
    
    
    
}
