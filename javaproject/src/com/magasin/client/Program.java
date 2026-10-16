/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.client;

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
        ClientDao clientDao = new ClientDaoImpl();
       int s ;
        do{
            System.out.println("Afficher Tout..................tapez 1");
            System.out.println("afficher un client.............tapez 2");
            System.out.println("Ajouter un client..............tapez 3");
            System.out.println("Mise a jour un client..........tapez 4");
            System.out.println("Supprimer un client............tapez 5");
            System.out.println("Quitter........................tapez 6");
            //lecture du s 
            do{
                Scanner sc =new  Scanner(System.in);
                s = sc.nextInt();
            }while(s<1 ||s>6);
            
            switch(s){
                case 1 :{
                    Collection<Client> list = clientDao.getAll();
                    for (Client c :list){
                    System.out.println(c.getId() + " " + c.getNom() + " " + c.getPrenom() + " " + c.getN_Tel());
                    }
                    break ;
                }
                case 2 :{
                    System.out.println("Veuillez saisir l'Id du client à afficher");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    Client cli =clientDao.getOne(i);
                    if (cli==null){
                        System.out.println("n'existe pas veuillez reéssayer");
                    }
                    else{
                        System.out.println(cli.getId() + " " + cli.getNom() + " " + cli.getPrenom()+" " 
                        + cli.getN_Tel());
                    }
                    break ;
                }
                case 3 :{
                    Client c =new Client();
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
                    clientDao.add(c);
                    break ;
                }
                case 4 :{
                    Client c =new Client();
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
                    clientDao.add(c);
                    break ;
                }
                case 5 :{
                    System.out.println("Veuillez saisir l'Id du client a supprimer ");
                    Scanner sc1 = new Scanner(System.in);
                    int i = sc1.nextInt();
                    clientDao.delete(i);
                    break ;
                }
                default:{
                    break ;
                }
            
            }
        }while(s>0 && s<6);
        
    }       
}