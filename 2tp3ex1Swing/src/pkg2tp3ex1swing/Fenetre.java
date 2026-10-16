/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2tp3ex1swing;

import java.awt.BorderLayout;
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

/**
 *
 * @author yassi
 */
public class Fenetre extends JFrame{
    public Fenetre(){
        this.setTitle("Ma premiere page");
          //this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        JTable table = new JTable();
        String[] titre = {"ID","LIBELLE","PRIX"};
        String[][] donnee = {{"1","smartphone","2500"},{"2","pc","4500"},{"3","watch","220"}};
        DefaultTableModel model=new DefaultTableModel(donnee,titre);
    
        table.setModel(model);
        JScrollPane tpan = new JScrollPane(table); 
        
        JComboBox combo = new JComboBox();
        combo.addItem(tpan);
        
        this.getContentPane().add(tpan,BorderLayout.NORTH);
        
        this.setVisible(true);
        pack();
        
        
    }
    
    
    
    
}
