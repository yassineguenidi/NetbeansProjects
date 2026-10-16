/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facture;

import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author yassi
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         FactureDao factureDao = new FactureDaoImpl();
       int s ;
        do{
            System.out.println("Afficher Tout....................tapez 1");
            System.out.println("afficher une facture.............tapez 2");
            System.out.println("Ajouter une facture..............tapez 3");
            System.out.println("Mise a jour une facture..........tapez 4");
            System.out.println("Supprimer une facture............tapez 5");
            System.out.println("Quitter..........................tapez 6");
            //lecture du s 
            do{
                Scanner sc =new  Scanner(System.in);
                s = sc.nextInt();
            }while(s<1||s>6);
            
            switch(s){
                case 1 :{
                    Collection<Facture> list = factureDao.getAll();
                    for (Facture f :list){
                    System.out.println(f.getId() + " " + f.getNom() + " " + f.getPrenom() + " " + f.getMontantPayer()
                    +" "+f.getMontantVerser()+" "+f.getMontantReste());
                    }
                    break ;
                }
                case 2 :{
                    System.out.println("Veuillez saisir l'Id du facture à afficher");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    Facture fac =factureDao.getOne(i);
                    if (fac==null){
                        System.out.println("n'existe pas veuillez reéssayer");
                    }
                    else{
                        System.out.println(fac.getId() + " " + fac.getNom() + " " + fac.getPrenom()+" " 
                        + fac.getMontantPayer() + " " + fac.getMontantVerser() + " " + fac.getMontantReste());
                    }
                    break ;
                }
                case 3 :{
                    Facture f =new Facture();
                    System.out.println("saisir l'Id");
                    Scanner ids= new Scanner(System.in);
                    int id = ids.nextInt();
                    f.setId(id);
                    System.out.println("saisir le nom");
                    Scanner scn= new Scanner(System.in);
                    String desn =scn.nextLine();
                    f.setNom(desn);
                    System.out.println("saisir le prenom");
                    Scanner scp= new Scanner(System.in);
                    String desp =scp.nextLine();
                    f.setPrenom(desp);
                    double montap ;
                    do{
                        System.out.println("saisir le montant a payer");
                        Scanner scnt= new Scanner(System.in);
                        montap =scnt.nextDouble();
                    }while(montap<0);
                     f.setMontantPayer(montap);
                    double montav ;
                     do{
                        System.out.println("saisir le montant a verser");
                        Scanner scmv= new Scanner(System.in);
                        montav =scmv.nextDouble();
                    }while(montav<0 );
                   
                    
                    f.setMontantPayer(montav);
                    f.setMontantReste(montap-montav);
                    factureDao.add(f);
                    break ;
                }
                case 4 :{
                    Facture f =new Facture();
                    System.out.println("saisir l'Id");
                    Scanner ids= new Scanner(System.in);
                    int id = ids.nextInt();
                    f.setId(id);
                    System.out.println("saisir le nom");
                    Scanner scn= new Scanner(System.in);
                    String desn =scn.nextLine();
                    f.setNom(desn);
                    System.out.println("saisir le prenom");
                    Scanner scp= new Scanner(System.in);
                    String desp =scp.nextLine();
                    f.setPrenom(desp);
                    double montap ;
                    do{
                        System.out.println("saisir le montant a payer");
                        Scanner scnt= new Scanner(System.in);
                        montap =scnt.nextDouble();
                    }while(montap<0);
                    
                    f.setMontantPayer(montap);
                    double montav ;
                    do{
                         System.out.println("saisir le montant a verser");
                         Scanner scmv= new Scanner(System.in);
                         montav =scmv.nextDouble();
                    }while(montav<0);
                    f.setMontantPayer(montav);
                    f.setMontantReste(montap-montav);
                    factureDao.update(f);
                    break ;
                }
                case 5 :{
                    System.out.println("Veuillez saisir l'Id du facture a supprimer ");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    factureDao.delete(i);
                    break ;
                }
                default:{
                    break ;
                }
            
            }
        }while(s>0 && s<6);
        
    }
    
}
