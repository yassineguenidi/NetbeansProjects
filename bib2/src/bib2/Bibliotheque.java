/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bib2;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author yassi
 */
public class Bibliotheque {
 
    Vector<Document> liste =new Vector<>(50);
    
    
    
    
    
   /*
    public int Capacité;
    public static int Nb=0;
    public Document[] doc;
    public Bibliotheque(int Capacité) {
        this.Capacité = Capacité;
        doc=new Document[7];
        Nb=0;
    }
    
    public void afficherDoc(){
        for(Document D:doc)                                                    
            System.out.println(D);
    }
    
    public Document document(int i){
        return (doc[i]) ;
    }

    public boolean ajouter(Document Doc){
        if(Nb<doc.length)
           this.doc[Nb++]=Doc;
        return true;
    }
    
    public boolean supprimer(Document Doc){
        for(int i=0;i<doc.length;i++){
            if(doc[i].NumEnreg==(Doc.NumEnreg))
              
                    doc[i]=doc[i+1];
        }
        Nb--;
            return true;  
    }
    
    public void afficherAuteur(){
        for(int i=0;i<doc.length;i++){
            if(doc[i] instanceof Livre)
                System.out.println((Livre) doc[i]) ;
    }
    }
    */

    public Bibliotheque() {
        
    }
}
