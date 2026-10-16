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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Fenetre1 extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField x,y,res;
	JButton b1,b2,b3;
        
	public Fenetre1()
	{
		
		l1=new JLabel("X= ");
		l2=new JLabel("Y= ");
		l3=new JLabel("RESULTAT= ");
		
		x=new JTextField(10);
		y=new JTextField(10);
		res=new JTextField(10);
		
		b1=new JButton(" + ");
		b2=new JButton(" - ");
		b3=new JButton(" EXIT ");
				
		
		JPanel p1=new JPanel(new GridLayout(2,2));
		p1.add(l1);
		p1.add(x);
		
		p1.add(l2);
		p1.add(y);
		
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		JPanel p3=new JPanel();
		p3.add(l3);
		p3.add(res);
		
	
		this.getContentPane().add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		b1.addActionListener(this);
                b2.addActionListener(new Ajout());
                b3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        System.exit(0);
                    }
                });
		setSize(400,150);
		setVisible(true);
	
	
	}

        
        
        class Ajout implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            res.setText( String.valueOf( Integer.parseInt(x.getText()) - Integer.parseInt(y.getText()))); 
            }   
        }
    
        
        
        @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
        res.setText( String.valueOf( Integer.parseInt(x.getText()) + Integer.parseInt(y.getText()))); 
    }
        else if(ae.getSource()==b2){
            
        }
        
    }
    
   
	}

