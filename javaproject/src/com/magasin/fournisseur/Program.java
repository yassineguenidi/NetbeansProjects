/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.fournisseur;

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
         FournisseurDao fournisseurDao = new FournisseurDaoImpl();
       int s ;
        do{
            System.out.println("Afficher Tout.......................tapez 1");
            System.out.println("afficher un fournisseur.............tapez 2");
            System.out.println("Ajouter un fournisseur..............tapez 3");
            System.out.println("Mise a jour un fournisseur..........tapez 4");
            System.out.println("Supprimer un fournisseur............tapez 5");
            System.out.println("Quitter.............................tapez 6");
            //lecture du s 
            do{
                Scanner sc =new  Scanner(System.in);
                s = sc.nextInt();
            }while(s<1 ||s>6);
            
            switch(s){
                case 1 :{
                    Collection<Fournisseur> list = fournisseurDao.getAll();
                    for (Fournisseur f :list){
                    System.out.println(f.getId() + " " + f.getNom() + " " + f.getPrenom() + " " + 
                    f.getN_Tel() + " " + f.getAdresse());
                    }
                    break ;
                }
                case 2 :{
                    System.out.println("Veuillez saisir l'Id du fournisseur à afficher");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    Fournisseur fourn =fournisseurDao.getOne(i);
                    if (fourn==null){
                        System.out.println("n'existe pas veuillez reéssayer");
                    }
                    else{
                        System.out.println(fourn.getId() + " " + fourn.getNom() + " " + fourn.getPrenom()+" " 
                        + fourn.getN_Tel() + " " + fourn.getAdresse());
                    }
                    break ;
                }
                case 3 :{
                    Fournisseur c =new Fournisseur();
                    System.out.println("saisir l'Id");
                    Scanner ids= new Scanner(System.in);
                    int id = ids.nextInt();
                    c.setId(id);
                    System.out.println("saisir le nom");
                    Scanner scn= new Scanner(System.in);
                    String desn =scn.nextLine();
                    c.setNom(desn);
                    System.out.println("saisir le prenom");
                    Scanner scp= new Scanner(System.in);
                    String desp =scp.nextLine();
                    c.setPrenom(desp);
                    System.out.println("saisir le numero du telephone");
                    Scanner scnt= new Scanner(System.in);
                    String desnp =scnt.nextLine();
                    c.setN_Tel(desnp);
                    System.out.println("saisir l'adresse");
                    Scanner scad= new Scanner(System.in);
                    String desad =scad.nextLine();
                    c.setAdresse(desad);
                    fournisseurDao.add(c);
                    break ;
                }
                case 4 :{
                    Fournisseur c =new Fournisseur();
                    System.out.println("saisir l'Id");
                    Scanner ids= new Scanner(System.in);
                    int id = ids.nextInt();
                    c.setId(id);
                    System.out.println("saisir le nom");
                    Scanner scn= new Scanner(System.in);
                    String desn =scn.nextLine();
                    c.setNom(desn);
                    System.out.println("saisir le prenom");
                    Scanner scp= new Scanner(System.in);
                    String desp =scp.nextLine();
                    c.setPrenom(desp);
                    System.out.println("saisir le numero du telephone");
                    Scanner scnt= new Scanner(System.in);
                    String desnp =scnt.nextLine();
                    c.setN_Tel(desnp);
                    System.out.println("saisir l'adresse");
                    Scanner scad= new Scanner(System.in);
                    String desad =scad.nextLine();
                    c.setAdresse(desad);
                    fournisseurDao.update(c);
                    break ;
                }
                case 5 :{
                    System.out.println("Veuillez saisir l'Id du fournisseur a supprimer ");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    fournisseurDao.delete(i);
                    break ;
                }
                default:{
                    break ;
                }
            
            }
        }while(s>0 && s<6);
        
    }       
}