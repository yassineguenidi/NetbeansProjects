/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtp3;

import java.awt.BorderLayout;
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
public class Fenetre1  extends JFrame  implements ActionListener{

    JLabel l1,l2,l3;
    JButton plus, moin ,exit;
    JTextField x, y , result ;
    
    public Fenetre1(){
        setTitle("Gestion des Nombres");
        //setSize(1000, 1000);
        //setLayout(new BorderLayout(10,0));
        
        l1= new JLabel("X= ");
        l2= new JLabel("Y= ");
        l3= new JLabel("Result = ");
        
        plus= new JButton("ADD");
        moin= new JButton("MOIN");
        exit = new JButton("Exit");
        
        plus.addActionListener(this);
        moin.addActionListener(this);
        exit.addActionListener(this);
        
        x = new JTextField(10);
        y = new JTextField(10);
        result = new JTextField(10);
        
        JPanel panel1 = new JPanel(new GridLayout(2, 2));
        
        panel1.add(l1);
        panel1.add(x);
        
        panel1.add(l2);
        panel1.add(y);
        
        
        JPanel panel2 = new JPanel();
        panel2.add(plus);
        panel2.add(moin);
        panel2.add(exit);
        
        
        JPanel panel3 = new JPanel();
        
        panel3.add(l3);
        panel3.add(result);
        
        
        this.getContentPane().add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);

        setSize(400,150);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==plus){
            result.setText(String.valueOf(Integer.parseInt(x.getText()) + Integer.parseInt(y.getText())));
        }
        if(ae.getSource()==moin){
            result.setText(String.valueOf(Integer.parseInt(x.getText()) - Integer.parseInt(y.getText())));
        }
        if(ae.getSource()==exit){
            System.exit(0);
        }
        
    }
    
    
    
}
