/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import Facture.Facture;
import Facture.FactureDao;
import Facture.FactureDaoImpl;
import com.magasin.client.Client;
import com.magasin.client.ClientDao;
import com.magasin.client.ClientDaoImpl;
import com.magasin.fournisseur.Fournisseur;
import com.magasin.fournisseur.FournisseurDao;
import com.magasin.fournisseur.FournisseurDaoImpl;
import com.magasin.stock.categorisManagement.Categorie;
import com.magasin.stock.categorisManagement.CategorieDAO;
import com.magasin.stock.categorisManagement.CategorieDAOImpl;
import com.magasin.stock.productManagement.Produit;
import com.magasin.stock.productManagement.ProduitDao;
import com.magasin.stock.productManagement.ProduitDaoImpl;
import com.magasin.ventes.Vente;
import com.magasin.ventes.VenteDao;
import com.magasin.ventes.VenteDaoImpl;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author yassi
 */
public class Javaproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int s ;
       CategorieDAO categorieDAO = new CategorieDAOImpl();
       ProduitDao produitDao = new ProduitDaoImpl();
       VenteDao venteDao = new VenteDaoImpl();
       FournisseurDao fournisseurDao = new FournisseurDaoImpl();
       ClientDao clientDao = new ClientDaoImpl();
       FactureDao factureDao = new FactureDaoImpl();
        do{
          System.out.println("Gestion du Stock......................tapez 1");
          System.out.println("Gestion du Vente......................tapez 2");
          System.out.println("Gestion du Fournisseur................tapez 3");
          System.out.println("Gestion du Client.....................tapez 4");
          System.out.println("Gestion du Facture....................tapez 5");
          System.out.println("Quitter...............................tapez 6");
         do{
             Scanner sc =new  Scanner(System.in);
             s = sc.nextInt();
         }while(s>6 || s<1);
         switch(s){
              case 1:{//stock
                  int sStock ;
                  do {
                      System.out.println("Gestion du Categorie................tapez 1");
                      System.out.println("Gestion du Produit..................tapez 2");
                      System.out.println("Quitter........................ ....tapez 3");
                      do{
                          Scanner scStock =new  Scanner(System.in);
                          sStock = scStock.nextInt();
                      }while(sStock>3 || sStock<1);
                      switch(sStock){
                          case 1 :{//categorie
                              int sCategorie ;
                              do{
                                   System.out.println("Afficher Tout..................tapez 1");
                                   System.out.println("afficher une categorie.........tapez 2");
                                   System.out.println("Ajouter une categorie..........tapez 3");
                                   System.out.println("Mise a jour une categorie......tapez 4");
                                   System.out.println("Supprimer une categorie........tapez 5");
                                   System.out.println("Quitter........................tapez 6");
                                  do{
                                       Scanner scCategorie =new  Scanner(System.in);
                                       sCategorie = scCategorie.nextInt();
                                  }while(sCategorie>6 || sCategorie<1);
                                   switch(sCategorie){
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
                              }while(sCategorie >0 && sCategorie<6);break;
                          }
                          case 2 :{//produit
                              int sProduit ;
                              do{
                                   System.out.println("Afficher Tout...............tapez 1");
                                   System.out.println("afficher un produit.........tapez 2");
                                   System.out.println("Ajouter un Produit..........tapez 3");
                                   System.out.println("Mise a jour un produit......tapez 4");
                                   System.out.println("Supprimer un Produit........tapez 5");
                                   System.out.println("Quitter.....................tapez 6");
                                  do{
                                       Scanner scProduit =new  Scanner(System.in);
                                       sProduit = scProduit.nextInt();
                                  }while(sProduit<1 || sProduit>6);
                                   switch(sProduit){
                                       case 1 :{
                                       Collection<Produit> list = produitDao.getAll();
                                       for (Produit p :list){
                                       System.out.println(p.getId() + " " + p.getDesignation() + " " + p.getPrix() + " " +p.getQuantite());
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
                                       System.out.println(prod.getId() + " " 
                                       + prod.getDesignation() + " " + prod.getPrix() + " " +prod.getQuantite());
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
                                       System.out.println("saisir le prix");
                                       Scanner prixs= new Scanner(System.in);
                                       double prix = prixs.nextDouble();
                                       p.setPrix(prix);
                                       System.out.println("saisir la quantité");
                                       Scanner qtts= new Scanner(System.in);
                                       int quan = qtts.nextInt();
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
                                       System.out.println("saisir le prix");
                                       Scanner prixs= new Scanner(System.in);
                                       double prix = prixs.nextDouble();
                                       p.setPrix(prix);
                                       System.out.println("saisir la quantité");
                                       Scanner qtts= new Scanner(System.in);
                                       int quan = qtts.nextInt();
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
                              }while(sProduit>0 && sProduit<6);break;
                          }
                          default:{
                              break;
                          }
                      }
                  }while(sStock>0&& sStock<3);break;
              }  
              case 2:{//vente
                  int sVente ;
                  do{
                       System.out.println("Afficher Tout........................tapez 1");
                       System.out.println("afficher un produit à vendre.........tapez 2");
                       System.out.println("Ajouter un Produit à vendre..........tapez 3");
                       System.out.println("Mise a jour un produit à vendre......tapez 4");
                       System.out.println("Supprimer un Produit à vendre........tapez 5");
                       System.out.println("Quitter..............................tapez 6");
                      do{
                           Scanner scVente =new  Scanner(System.in);
                           sVente = scVente.nextInt();
                      }while(sVente>6 ||sVente<1);
                       switch(sVente){
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
                          System.out.println("saisir le prix");
                          Scanner prixs= new Scanner(System.in);
                          double prix = prixs.nextDouble();
                          v.setPrix(prix);
                          System.out.println("saisir la quantité");
                          Scanner qtts= new Scanner(System.in);
                          int quan = qtts.nextInt();
                          v.setQuantite(quan);
                          System.out.println("saisir le prix à vendre");
                          Scanner scpav= new Scanner(System.in);
                          double pav = scpav.nextDouble();
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
                          double prix ;
                          do{
                              System.out.println("saisir le prix");
                              Scanner prixs= new Scanner(System.in);
                              prix = prixs.nextDouble();
                          }while(prix<0);
                          v.setPrix(prix);
                          int quan;
                          do{
                              System.out.println("saisir la quantité");
                              Scanner qtts= new Scanner(System.in);
                              quan = qtts.nextInt();
                          }while(quan<0);
                          v.setQuantite(quan);
                          double pav;                         
                          do{
                              System.out.println("saisir le prix à vendre");
                              Scanner scpav= new Scanner(System.in);
                              pav = scpav.nextDouble();
                         }while(pav<0);
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
                  }while(sVente>0 &&sVente<6);break;
              } 
              case 3:{//fournisseur
                  int sFournisseur ;
                  do{
                       System.out.println("Afficher Tout.......................tapez 1");
                       System.out.println("afficher un fournisseur.............tapez 2");
                       System.out.println("Ajouter un fournisseur..............tapez 3");
                       System.out.println("Mise a jour un fournisseur..........tapez 4");
                       System.out.println("Supprimer un fournisseur............tapez 5");
                       System.out.println("Quitter.............................tapez 6");
                       do{
                           Scanner scFournisseur =new  Scanner(System.in);
                           sFournisseur = scFournisseur.nextInt();
                       }while(sFournisseur<1 || sFournisseur>6);
                      
                       switch(sFournisseur){
                           
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
                          String desnt =scnt.nextLine();
                          c.setN_Tel(desnt);
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
                  }while(sFournisseur>0 && sFournisseur<6);break;
              } 
              case 4:{//client
                  int sClient ;
                  do{
                       System.out.println("Afficher Tout..................tapez 1");
                       System.out.println("afficher un client.............tapez 2");
                       System.out.println("Ajouter un client..............tapez 3");
                       System.out.println("Mise a jour un client..........tapez 4");
                       System.out.println("Supprimer un client............tapez 5");
                       System.out.println("Quitter........................tapez 6");
                       do{
                           Scanner scClient =new  Scanner(System.in);
                           sClient = scClient.nextInt();
                       }while(sClient>6 || sClient<1);
                       
                       switch(sClient){
                           
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
                  }while(sClient>0 && sClient<6);break;
              } 
              case 5:{//facture
                  int sFacture ;
                  do{
                       System.out.println("Afficher Tout....................tapez 1");
                       System.out.println("afficher une facture.............tapez 2");
                       System.out.println("Ajouter une facture..............tapez 3");
                       System.out.println("Mise a jour une facture..........tapez 4");
                       System.out.println("Supprimer une facture............tapez 5");
                       System.out.println("Quitter..........................tapez 6");
                       do{
                           Scanner scFacture =new  Scanner(System.in);
                           sFacture = scFacture.nextInt();
                       }while(sFacture>6 || sFacture<1);
                     
                       switch(sFacture){
                           
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
                                   }while(montav<0);
                                 
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
                  }while(sFacture>0 && sFacture <6);break;
              } 
              default:{
                 break ; 
              }
          }
          
      }while(s>0 && s<6);
      }
}
