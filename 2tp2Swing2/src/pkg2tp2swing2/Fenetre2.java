/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp2swing2;

/**
 *
 * @author yassi
 */


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Fenetre2 extends JFrame implements ActionListener{
    
    ConnectSql conn = new ConnectSql();
    Statement stm ;
    ResultSet Rs ;
    Traitement tr = new Traitement();
    JLabel l1=new JLabel("ID ");
    JLabel l2=new JLabel("LIBELLE ");
    JLabel l3=new JLabel("PRIX ");
    JTextField txt1=new JTextField(20);
    JTextField txt2=new JTextField(20);
    JTextField txt3=new JTextField(20);
    JButton b1=new JButton("Ajouter");
    JButton b2=new JButton("Supprimer");
    JButton b3=new JButton("Quitter");
    JTable table=new JTable();
    String[]Titre={"ID","LIBELLE","PRIX"};

    DefaultTableModel model;
    JScrollPane tpan=new JScrollPane(table);
         
	
	
    public Fenetre2()
    {
        
        model=new DefaultTableModel();
	model.setColumnIdentifiers(Titre);
        
        afficher();
	
        table.setModel(model);
        
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(0,2));
	p1.add(l1);
	p1.add(txt1);
	p1.add(l2);
	p1.add(txt2);  
	p1.add(l3);
	p1.add(txt3);
	
	JPanel p2=new JPanel();
	p2.add(b1);
	p2.add(b2);
	p2.add(b3);


	this.getContentPane().add(tpan, BorderLayout.NORTH);
	this.getContentPane().add(p1,BorderLayout.CENTER);
	this.getContentPane().add(p2,BorderLayout.SOUTH);
	
        b1.addActionListener(this);
        
        b2.addActionListener(new ActionListener() {
            

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try{
                    if(JOptionPane.showConfirmDialog(null, "attention vous allez supprimer un produit !","suppression",
                 JOptionPane.YES_NO_OPTION )==JOptionPane.YES_OPTION  ){
                        if(txt1.getText().length()!=0){
                            int id =Integer.parseInt(txt1.getText());
                            tr.supprimerProduit(id);
                            txt1.setText("");
                            txt2.setText("");
                            txt3.setText("");
                            afficher();
                        }else{
                             JOptionPane.showMessageDialog(null,"Veuillez remplir le champs id !");
                            }
                        }
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"erreur de suppression !"+ ex.getMessage());}
                    }
            });
        
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
                }
            });
	setSize(400,600);
	setVisible(true);
	
	
	}

    private void afficher(){
          model.setRowCount(0);
          try{
            stm=conn.obtenirconnexion().createStatement();
            ArrayList<Produit> list =(ArrayList<Produit>) tr.getAll();
            for(Produit x : list){
                model.addRow(new String[]{String.valueOf(x.getId()),String.valueOf(x.getLibelle()),String.valueOf(x.getPrix())});
            }
        }catch(Exception e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"erreur de 'affichage "+e.getLocalizedMessage());
        }
        table.setModel(model);
         }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int id=Integer.parseInt(txt1.getText());
            String libelle = txt2.getText();
            int prix =Integer.parseInt(txt3.getText());
            Produit p = new Produit(id,libelle,prix);
            tr.AjouterProduit(p);
            afficher();
        }
        catch(Exception ex){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"erreur d'ajout "+ex.getLocalizedMessage());
        }
    }
		
     
}
