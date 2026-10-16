/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.ventes;


import com.magasin.stock.categorisManagement.Categorie;
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
        VenteDao venteDao = new VenteDaoImpl();
       int s ;
        do{
            System.out.println("Afficher Tout........................tapez 1");
            System.out.println("afficher un produit à vendre.........tapez 2");
            System.out.println("Ajouter un Produit à vendre..........tapez 3");
            System.out.println("Mise a jour un produit à vendre......tapez 4");
            System.out.println("Supprimer un Produit à vendre........tapez 5");
            System.out.println("Quitter..............................tapez 6");
            //lecture du s 
            do{
                Scanner sc =new  Scanner(System.in);
                s = sc.nextInt();
            }while(s<1||s>6);
            
            switch(s){
                case 1 :{
                    Collection<Vente> list = venteDao.getAll();
                    for (Vente v :list){
                    System.out.println(v.getId() + " " + v.getDesignation() + " " + v.getPrix() + " " +v.getQuantite()
                          +" "+v.getPrixVente()+" "+v.getGain());
                    }
                    break ;
                }
                case 2 :{
                    System.out.println("Veuillez saisir l'Id du produit a afficher");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    Vente vente =venteDao.getOne(i);
                    if (vente==null){
                        System.out.println("n'existe pas veuillez reéssayer");
                    }
                    else{
                        System.out.println(vente.getId() + " " + vente.getDesignation() + " " + vente.getPrix() + 
                        " " +vente.getQuantite()+ " " + vente.getPrixVente() + " " + vente.getGain());
                    }
                    break ;
                }
                case 3 :{
                    Vente v =new Vente();
                    System.out.println("saisir l'Id");
                    Scanner ids= new Scanner(System.in);
                    int id = ids.nextInt();
                    v.setId(id);
                    System.out.println("saisir la designation");
                    Scanner scd= new Scanner(System.in);
                    String des =scd.nextLine();
                    v.setDesignation(des);
                    double prix ;
                    do{
                        System.out.println("saisir le prix");
                        Scanner prixs= new Scanner(System.in);
                        prix = prixs.nextDouble();
                    }while(prix<0);
                   
                    v.setPrix(prix);
                    int quan ;
                    do{
                        System.out.println("saisir la quantité");
                        Scanner qtts= new Scanner(System.in);
                        quan = qtts.nextInt(); 
                    }while(quan<0);
                    v.setQuantite(quan);
                    double pav ;
                    do{
                        System.out.println("saisir le prix à vendre");
                        Scanner scpav= new Scanner(System.in);
                        pav = scpav.nextDouble(); 
                    }while(pav<0);
                    
                    v.setPrixVente(pav);
                    v.setGain(pav-prix);
                    venteDao.add(v);
                    break ;
                }
                case 4 :{
                    Vente v =new Vente();
                    System.out.println("saisir l'Id");
                    Scanner ids= new Scanner(System.in);
                    int id = ids.nextInt();
                    v.setId(id);
                    System.out.println("saisir la designation");
                    Scanner scd= new Scanner(System.in);
                    String des =scd.nextLine();
                    v.setDesignation(des);
                    double prix;
                    do{
                     System.out.println("saisir le prix");
                     Scanner prixs= new Scanner(System.in);
                     prix = prixs.nextDouble();                       
                    }while(prix<0);
                   
                    v.setPrix(prix);
                    int quan ;
                    do{
                        System.out.println("saisir la quantité");
                        Scanner qtts= new Scanner(System.in);
                        quan = qtts.nextInt();
                    }while(quan<0);
                    
                    v.setQuantite(quan);
                    double pav ;
                    do{
                        System.out.println("saisir le prix à vendre");
                        Scanner scpav= new Scanner(System.in);
                        pav = scpav.nextDouble(); 
                    }while(pav <0);
                   
                    v.setPrixVente(pav);
                    v.setGain(pav-prix);
                    venteDao.update(v);
                    break ;
                }
                case 5 :{
                    System.out.println("Veuillez saisir l'Id du produit à vendre à supprimer ");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    venteDao.delete(i);
                    break ;
                }
                default:{
                    break ;
                }
            
        }
        }while(s>0 && s<6);
        
    }
}
    

