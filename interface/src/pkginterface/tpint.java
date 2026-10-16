/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;
class personne{
String nom ;
int age ;
public personne(){ 
nom= "yassine";
age=21 ;
};
public String toString(){
    return ( nom +" "+ age ) ;
}
};
public class tpint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   personne p = new personne();
   System.out.println(p);
    }
    
}
