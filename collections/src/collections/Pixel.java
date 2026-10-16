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
public class Pixel extends Point{
    private Color color;
    public Pixel(int x, int y, Color color) {
        super(x, y);
        this.color = color;
        }
public Color getColor() {
return color;
}

}
