/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschooltp2;

/**
 *
 * @author yassi
 */
public class Date {
    int jour;
    int mois;
    int annee ;

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public Date() {
    }
    
    
    
    public void afficher(){
        System.out.println(this.jour+"/"+this.mois+"/"+this.annee);
    }
    
    public static int compareDatesStat(Date d1, Date d2){
        
        if(d1.annee>d2.annee){
            return 1;
        }
        else if (d1.annee<d2.annee){
            return -1;
        }
        else if(d1.mois>d2.mois)
            return 1;
        else if (d1.mois<d2.mois){
            return -1;
        }
        else if(d1.jour>d2.jour){
            return 1;
        }
        else if (d1.jour<d2.jour){
            return -1;
        }
        else return 0;
        
    }
    public  int compareDates(Date d2){
        
        if(this.annee>d2.annee){
            return 1;
        }
        else if (this.annee<d2.annee){
            return -1;
        }
        else if(this.mois>d2.mois)
            return 1;
        else if (this.mois<d2.mois){
            return -1;
        }
        else if(this.jour>d2.jour){
            return 1;
        }
        else if (this.jour<d2.jour){
            return -1;
        }
        else return 0;
        
    }
}
