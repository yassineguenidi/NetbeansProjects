package demineur;
//import com.incors.plaf.kunststoff.*; //look kunststoff si vous avez
import java.util.*;
import javax.swing.*;


public class Main {

  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    new Demineur(16,30,99,3);// on lance le jeux en expert
  }
}

