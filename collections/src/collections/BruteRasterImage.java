/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.awt.Color;

/**
 *
 * @author yassi
 */
public class BruteRasterImage implements Image {

     Color[][] pixel ;
     int hieght ;
     int width ;
      public BruteRasterImage( Color[][] pixel) {
  
        hieght=pixel[0].length ;
        width=pixel.length;
       if( hieght ==0 || width==0 ){
           throw new IllegalArgumentException("saisie non valide") ;
       } 
       

    }


    @Override
    public Color colorGetPixel(int x, int y) {
      return pixel[x][y];
      
    }

    @Override
    public int getWidth() {
     return width ;
    }

    @Override
    public int getHeight() {
      return hieght;
    }
    
    
}
