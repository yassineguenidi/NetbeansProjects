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
public interface Shape {
   
/**
* Tests if a specified Point is inside the boundary of the Shape.
*/
boolean contains(Point point);
/**
* Return the color of the interior of the Shape.
*/
Color getFillColor();
}
