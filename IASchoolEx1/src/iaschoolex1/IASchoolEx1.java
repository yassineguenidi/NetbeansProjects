/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaschoolex1;

/**
 *
 * @author yassi
 */
public class IASchoolEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Point p = new Point();
        // p.x=0;
        System.out.println(p.x);
        System.out.println(p.y);
        
        Point p2 = new Point(14);
        p.x=0;
        System.out.println(p2.x);
        System.out.println(p2.y);
        
        Point p4 = p2;
        System.out.println(p4.x);
        System.out.println(p4.y);
        
    }
}
/*int tab[];
        tab = new int[4];
        tab[0] = 5;
        tab[1] = 6;
        tab[2] = 7;
        tab[3] = tab[0] + tab[1];

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
}*/
