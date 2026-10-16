/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

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
public class fenetre extends JFrame implements ActionListener{

    private JButton creer, ajouter, afficher ,quitter;
    private JTextField niveau, numero, nom, prenom, moyenne ;
    private JLabel niveaul, numerol, noml, prenoml, moyennel ;
    private Ecole  ecol ;
    
    public fenetre(){
        setTitle("Gestion de l'ecole");
        setSize(560, 150);
        setLayout(new BorderLayout(10,0));
        
        ecol = new Ecole();
        JPanel labels = new JPanel(new GridLayout(5, 1));
        JPanel inputs = new JPanel(new GridLayout(5, 1));
        //inputs.setPreferredSize(new Dimension(200,200));
        JPanel buttons = new JPanel(new GridLayout(4, 1));
        
        creer = new JButton("Creer Niveau");
        ajouter = new JButton("Ajouter Eleve");
        afficher = new JButton("Afficher Premier");
        quitter = new JButton("Quitter");
        
        creer.addActionListener(this);
        ajouter.addActionListener(this);
        afficher.addActionListener(this);
        quitter.addActionListener(this);
        
        niveau = new JTextField(10);
        numero = new JTextField(10);
        nom = new JTextField(10);
        prenom = new JTextField(10);
        moyenne = new JTextField(10);
        
        inputs.add(niveau);
        inputs.add(numero);
        inputs.add(nom);
        inputs.add(prenom);
        inputs.add(moyenne);
        
        niveaul = new JLabel("Niveau");
        numerol = new JLabel("Numero");
        noml = new JLabel("Nom");
        prenoml = new JLabel("Prenom");
        moyennel = new JLabel("Moyenne");
        
        labels.add(niveaul);
        labels.add(numerol);
        labels.add(noml);
        labels.add(prenoml);
        labels.add(moyennel);

        buttons.add(creer);
        buttons.add(ajouter);
        buttons.add(afficher);
        buttons.add(quitter);
        
        
        add(labels, BorderLayout.WEST);
        add(inputs, BorderLayout.CENTER);
        add(buttons, BorderLayout.EAST);
        setVisible(true); 
        
        
        
        
        
    }  




    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == quitter) {
            System.exit(0);
        }
        if (ae.getSource() == creer) {
            ecol.AjouterNiveau(niveau.getText());
        }
        
        if (ae.getSource() == ajouter) {
            if (niveau.getText() != "") {
                
                ecol.Ajouter(String.valueOf(niveau.getText()), new Eleve(Integer.parseInt(numero.getText()), nom.getText(),
                        prenom.getText(), Float.parseFloat(moyenne.getText())));
                
                ecol.afficher();
            }
        }
        
        if (ae.getSource() == afficher) {
                
                Eleve el = ecol.afficherPremier(niveau.getText()) ;
                
                numero.setText(String.valueOf(el.getNum()));
                nom.setText(String.valueOf(el.getNom()));
                prenom.setText(String.valueOf(el.getPrenom()));
                moyenne.setText(String.valueOf(el.getMoyenne()));
                
            }
        
        
    }
    
}
