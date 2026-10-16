/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirjava;



/**
 *
 * @author yassi
 */
public class Stack {
    final static int SIZE = 50;
    static int n =0 ;
    private int sp ;
    private String[] t ;
  
    
    
    public Stack(int sp) {
        this.sp = sp;
    }
  

    Stack () { 
       t = new String[SIZE] ;
       sp = 0;
    }
  
  
   boolean isEmpty() {
       return sp == 0 ;
   }

   void push(String x) {
    if (sp >= SIZE) throw new Error ("Push : pile pleine") ;
    t[sp++] = x ;  
    n++;
   }

   String pop() {
    if (isEmpty())
        throw new Error ("Pop : pile vide") ;
    
    n--;
    return t[--sp] ; 
    
  }
  
      public int size(){
        return n;
    } 
}
  
  
  
  