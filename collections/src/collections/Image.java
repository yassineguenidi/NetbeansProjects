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
public interface Image {
   Color colorGetPixel(int x,int y);
   int getWidth();
   int getHeight();
    
}
