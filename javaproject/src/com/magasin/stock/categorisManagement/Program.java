/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.stock.categorisManagement;


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
       
         CategorieDAO categorieDAO = new CategorieDAOImpl();
       int s ;
        do{
            System.out.println("Afficher Tout..................tapez 1");
            System.out.println("afficher une categorie.........tapez 2");
            System.out.println("Ajouter une categorie..........tapez 3");
            System.out.println("Mise a jour une categorie......tapez 4");
            System.out.println("Supprimer une categorie........tapez 5");
            System.out.println("Quitter........................tapez 6");
            //lecture du s 
            do{
                Scanner sc =new  Scanner(System.in);
                s = sc.nextInt();
            }while(s<1||s>6);
            
            switch(s){
                case 1 :{
                    Collection<Categorie> list = categorieDAO.getAll();
                    for (Categorie c :list){
                    System.out.println(c.getId() + " " + c.getDesignation() );
                    }
                    break ;
                }
                case 2 :{
                    System.out.println("Veuillez saisir l'Id du categorie à afficher");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    Categorie cat =categorieDAO.getOne(i);
                    if (cat==null){
                        System.out.println("n'existe pas veuillez reéssayer");
                    }
                    else{
                        System.out.println(cat.getId() + " " + cat.getDesignation());
                    }
                    break ;
                }
                case 3 :{
                    Categorie c =new Categorie();
                    System.out.println("saisir l'Id");
                    Scanner ids= new Scanner(System.in);
                    int id = ids.nextInt();
                    c.setId(id);
                    System.out.println("saisir la designation");
                    Scanner scd= new Scanner(System.in);
                    String des =scd.nextLine();
                    c.setDesignation(des);
                    categorieDAO.add(c);
                    break ;
                }
                case 4 :{
                    Categorie c =new Categorie();
                    System.out.println("saisir l'Id");
                    Scanner ids= new Scanner(System.in);
                    int id = ids.nextInt();
                    c.setId(id);
                    System.out.println("saisir la designation");
                    Scanner scd= new Scanner(System.in);
                    String des =scd.nextLine();
                    c.setDesignation(des);
                    categorieDAO.add(c);
                    break ;
                }
                case 5 :{
                    System.out.println("Veuillez saisir l'Id du produit a supprimer ");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    categorieDAO.delete(i);
                    break ;
                }
                default:{
                    break ;
                }
            
        }
        }while(s>0 && s<6);
        
        }       
}     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       /* CategorieDAO categorieDAO = new CategorieDAOImpl();
       
        System.out.println("getOne..............");
        
        Categorie cat =categorieDAO.getOne(1);
        System.out.println(cat.getId()+ " " + cat.getDesignation());
       
        System.out.println("getAll..............");
        
        Collection<Categorie> list = categorieDAO.getAll();
        for (Categorie c :list){
            System.out.println(c.getId()+" "+ c.getDesignation());
        }
        
        System.out.println("Add.................");
        
        categorieDAO.add(new Categorie(4,"souris"));
        categorieDAO.add(new Categorie(5,"clavier"));
        for (Categorie c :list){
            System.out.println(c.getId()+" "+ c.getDesignation());
        }
        System.out.println("update.................");
        
         categorieDAO.update(new Categorie(5,"cables"));
        for (Categorie c :list){
            System.out.println(c.getId()+" "+ c.getDesignation());
        }
        
         System.out.println("Delete.................");
           categorieDAO.delete(5);
        for (Categorie c :list){
          System.out.println(c.getId()+" "+ c.getDesignation());}
    }
    
}*/

