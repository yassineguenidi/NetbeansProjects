/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtp2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author yassi
 */
public class Fenetre2  extends JFrame implements ActionListener{

    private JButton cree, ajouter, annuler ;
    private JTextField numCmd, idProd, libelle, prix;
    private Commandes cmds;
   
    public Fenetre2(){
        setTitle("Ajouter une commande");
        setSize(530,500);
        setLayout(new BorderLayout(10,0));
        cmds = new Commandes();
        
        JPanel labels = new JPanel(new GridLayout(4, 1));
        JPanel inputs = new JPanel(new GridLayout(4, 1));
        inputs.setPreferredSize(new Dimension(200,150));
        JPanel buttons = new JPanel(new GridLayout(3, 1));
        
        
        labels.add(new JLabel("Num Commande "));
        labels.add(new JLabel("Id Produit "));
        labels.add(new JLabel("Libelle "));
        labels.add(new JLabel("Prix "));
        
        numCmd = new JTextField();
        idProd= new JTextField();
        libelle = new JTextField();
        prix = new JTextField();
        
        inputs.add(numCmd);
        inputs.add(idProd);
        inputs.add(libelle);
        inputs.add(prix);
        
        cree= new JButton("Creer une commande");
        ajouter= new JButton("Ajouter un produit");
        annuler= new JButton("Annuler");
        
        cree.addActionListener(this);
        ajouter.addActionListener(this);
        annuler.addActionListener(this);
        
        
        buttons.add(cree);
        buttons.add(ajouter);
        buttons.add(annuler);
        
        add(labels, BorderLayout.WEST);
        add(inputs, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);
        setVisible(true); 
        
        
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==annuler){
            numCmd.setText("");
            idProd.setText("");
            libelle.setText("");
            prix.setText("");
        }
        if(ae.getSource()==cree){
            cmds.ajouterCommand();
            numCmd.setText(String.valueOf(cmds.getN()));
            
        }
        
        if (ae.getSource() == ajouter) {
            
        
            if (numCmd.getText() != "") {
                String numCommand = "Commande n" + numCmd.getText();
                cmds.ajouterProduit(numCommand, new Produit(Integer.parseInt(idProd.getText()), libelle.getText(),
                        Double.parseDouble(prix.getText())));
                cmds.afficher();
            }
        }
    }
    
}
