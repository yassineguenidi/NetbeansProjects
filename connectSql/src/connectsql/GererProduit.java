/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectsql;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.* ;

/**
 *
 * @author yassi
 */
public class GererProduit {

    public GererProduit() {
    }
    
    public void AfficherPoduits(){
        try{
            Connecter con = new Connecter();
            con.obtenirconnexion();
            Statement stm ;
            stm=con.obtenirconnexion().createStatement();
            String strQuery = "SELECT * FROM produit";
            ResultSet prod = stm.executeQuery(strQuery);
            while(prod.next()){
                System.out.println(" Ref :" +prod.getInt("ref")+
                            " nom Produit : "+prod.getString("nomP")+
                            " description : "+prod.getString("descriptionP")+
                            " prix Unitaire : "+prod.getInt("prixUnitaireP")            
                    );
            }
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("not conected");
        }
    }
    
    public void AjouterProduit(int ref,String nomP,String descP ,int prixUni) {
        try{
            Connecter conn = new Connecter();
            Statement stm ;
            stm=conn.obtenirconnexion().createStatement();
            String requete = "insert into produit (ref,nomP,descriptionP,prixUnitaireP)VALUES('"
                 +ref+"','"+nomP+"','"+descP+"','"+prixUni+"')";
            stm.executeUpdate(requete);
            
        }catch(Exception e){System.err.println(e);
            System.out.println(e);
            System.out.println("produit non ajouté");
        }
    }
    
    public void supprimerProduit(int ref){
        try{
            Connecter conn = new Connecter();
            Statement stm ;
            ResultSet Rs ;
            stm=conn.obtenirconnexion().createStatement();
            String requete = "DELETE FROM produit where ref="+ ref;
            stm.executeUpdate(requete);
            
        }catch(Exception e){System.err.println(e);
            System.out.println(e);
            System.out.println("not connected");
        }
    }
    
    public void rechercherProduit(int ref){
        try{
            Connecter conn = new Connecter();
            Statement stm ;
            ResultSet Rs ;
            stm=conn.obtenirconnexion().createStatement();
            ResultSet prod=stm.executeQuery("SELECT * FROM produit WHERE ref='" +  ref+"'");
            while(prod.next()){
                System.out.println(" Ref :" +prod.getInt("ref")+
                            " nom Produit : "+prod.getString("nomP")+
                            " description : "+prod.getString("descriptionP")+
                            " prix Unitaire : "+prod.getInt("prixUnitaireP")            
                    );
            }
            
            
            
        }catch(Exception e){System.err.println(e);
            System.out.println(e);
            System.out.println("not connected");
        }
        
    }
    
    public void modifierProduit(int ref,String nomP,String descP ,int prixUni){
        try{
            Connecter conn = new Connecter();
            Statement stm ;
            stm=conn.obtenirconnexion().createStatement();
            stm.executeUpdate("UPDATE produit  SET nomP ='"+nomP+"',descriptionP='"+descP
                    +"', prixUnitaireP='"+prixUni+
                                   "'WHERE ref= "+ref);
            
            
        }catch(Exception e){System.err.println(e);
            System.out.println(e);
            System.out.println("not connected");
        }
        
    }
    
    
}
