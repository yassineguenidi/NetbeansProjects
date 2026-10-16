/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devtp;

/**
 *
 * @author yassi
 */
public class Devtp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Locateur l = new Locateur("robotech","fsm","yassine","guenidi");
      l.afficheLocateur();
      Organise o = new Organise(10);
      Film f1 =new Film("noura te7lem","drama","rf25gh");
      f1.afficheFIlm();
      Film f2 =new Film("dachra","drama","wd17bh");
      Film f3 =new Film("bik n3ich","drama","rs45fr");
      o.ajouter(f1);
      o.ajouter(f2);
      o.ajouter(f3);
      try{
          o.afficherTous();
      }
      catch(Exception e){
          e.getMessage();
      }
      System.out.print("veriffff");
      Client c1 =new Client("15","ahmed","landolsi");
      c1.affichieClient();
      o.rechercheFilm("asfour sta7");
    }
    
}
