/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirjava;

import java.util.Iterator;

/**
 *
 * @author yassi
 */
public class DevoirJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Stack s = new Stack(2);
      s.push("message 1");
      s.push("Message 2");
      System.out.println(s.size()); 
      System.out.println(s.pop()); 
      System.out.println(s.size());
      
      
      
      
    }

    }

    

