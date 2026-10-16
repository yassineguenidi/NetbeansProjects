/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.stock.productManagement;

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
       ProduitDao produitDao = new ProduitDaoImpl();
       int s ;
        do{
            System.out.println("Afficher Tout...............tapez 1");
            System.out.println("afficher un produit.........tapez 2");
            System.out.println("Ajouter un Produit..........tapez 3");
            System.out.println("Mise a jour un produit......tapez 4");
            System.out.println("Supprimer un Produit........tapez 5");
            System.out.println("Quitter.....................tapez 6");
            //lecture du s 
            do{
                Scanner sc =new  Scanner(System.in);
                s = sc.nextInt();
            }while(s<1||s>6);
            
            switch(s){
                case 1 :{
                    Collection<Produit> list = produitDao.getAll();
                    for (Produit p :list){
                         System.out.println(p.getCategorie().getId()+" "+p.getCategorie().getDesignation()+ " " +
                         p.getId() + " " + p.getDesignation() + " " + p.getPrix() + " " +p.getQuantite());
                    }
                    break ;
                }
                case 2 :{
                    System.out.println("Veuillez saisir l'Id du produit a afficher");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    Produit prod =produitDao.getOne(i);
                    if (prod==null){
                        System.out.println("n'existe pas veuillez reéssayer");
                    }
                    else{
                        System.out.println(prod.getCategorie().getId()+" "+prod.getCategorie().getDesignation()+ " " +
                        prod.getId() + " " + prod.getDesignation() + " " + prod.getPrix() + " " +prod.getQuantite());
                    }
                    break ;
                }
                case 3 :{
                    Produit p =new Produit();
                    System.out.println("saisir l'Id");
                    Scanner ids= new Scanner(System.in);
                    int id = ids.nextInt();
                    p.setId(id);
                    System.out.println("saisir la designation");
                    Scanner scd= new Scanner(System.in);
                    String des =scd.nextLine();
                    p.setDesignation(des);
                    double prix ;
                    do{
                        System.out.println("saisir le prix");
                        Scanner prixs= new Scanner(System.in);
                        prix = prixs.nextDouble();
                    }while(prix<0);
                    p.setPrix(prix);
                    int quan ;
                    do{
                         System.out.println("saisir la quantité");
                         Scanner qtts= new Scanner(System.in);
                         quan = qtts.nextInt();
                    }while(quan<0);
                   
                    p.setQuantite(quan);
                    produitDao.add(p);
                    break ;
                }
                case 4 :{
                    Produit p =new Produit();
                    System.out.println("saisir l'Id");
                    Scanner ids= new Scanner(System.in);
                    int id = ids.nextInt();
                    p.setId(id);
                    System.out.println("saisir la designation");
                    Scanner scdd= new Scanner(System.in);
                    String des =scdd.nextLine();
                    p.setDesignation(des);
                    double prix ;
                    do{
                        System.out.println("saisir le prix");
                        Scanner prixs= new Scanner(System.in);
                        prix = prixs.nextDouble();
                    }while(prix<0);
                    
                    p.setPrix(prix);
                    int quan ;
                    do{
                        System.out.println("saisir la quantité");
                        Scanner qtts= new Scanner(System.in);
                        quan = qtts.nextInt();
                    }while(quan<0);
                    
                    p.setQuantite(quan);
                    produitDao.add(p);
                    break ;
                }
                case 5 :{
                    System.out.println("Veuillez saisir l'Id du produit a supprimer ");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    produitDao.delete(i);
                    break ;
                }
                default:{
                    break ;
                }
            
        }
        }while(s>0 && s<6);
        
    }
}        
        
     













































//  ProduitDao produitDao = new ProduitDaoImpl();
      
      /*System.out.println("getOne..............");
        
        Produit prod =produitDao.getOne(1);
        System.out.println(prod.getCategorie().getId() + " " + prod.getCategorie().getDesignation() + " " + prod.getPrix() + " " +prod.getQuantite());
        
        System.out.println("getAll..............");
        
        Collection<Produit> list = produitDao.getAll();
        for (Produit p :list){
            System.out.println(p.getId() + " " + p.getDesignation() + " " + p.getPrix() + " " +p.getQuantite());
        }
        
        System.out.println("Add.................");
        
        produitDao.add(new Produit(2, "galaxy s20", 799, 20,new Categorie(2,"smartphone")));
        produitDao.add(new Produit(2, "Iphone X", 1199, 10,new Categorie(2,"smartphone")));
        for (Produit p :list){
            System.out.println(p.getId() + " " + p.getDesignation() + " " + p.getPrix() + " " +p.getQuantite());
        }
        System.out.println("update.................");
        
         produitDao.update(new Produit(2, "Iphone XI", 1199, 10,new Categorie(2,"smartphone")));
        for (Produit p :list){
            System.out.println(p.getId() + " " + p.getDesignation() + " " + p.getPrix() + " " +p.getQuantite());
        }
        
         System.out.println("Delete.................");
           produitDao.delete(2);
        for (Produit p :list){
            System.out.println(p.getId() + " " + p.getDesignation() + " " + p.getPrix() + " " +p.getQuantite());
        }
    */
  //  }
    

