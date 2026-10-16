/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp3ex1swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author yassi
 */
public class fenetre2 extends JFrame{
    JLabel lab;
    JButton b1;
    JButton b2;
    JButton b3;
    JPasswordField pwd1;
    JTextField txt1;
    
    public fenetre2(){
        this.setTitle("Hello");
        b1= new JButton("ok");
        b2= new JButton("Annuler");
        b3= new JButton("Fermer");
        
        JLabel l1 = new JLabel("Login");
        JLabel l2 = new JLabel("password");
        
        txt1 = new JTextField(20);
        pwd1 = new JPasswordField(20);
        
        JPanel  pan1 = new  JPanel(new GridLayout(0, 2));
        JPanel pan2 = new JPanel();
         
        pan1.add(l1);
        pan1.add(txt1);
        pan1.add(l2);
        pan1.add(pwd1);
        
        pan2.add(b1);
        pan2.add(b2);
        pan2.add(b3);
        
        this.getContentPane().add(pan1,BorderLayout.NORTH);
        this.getContentPane().add(pan2,BorderLayout.SOUTH);
        
        this.setVisible(true);
        pack();
        
        
        
        
        
        
    }
 }
