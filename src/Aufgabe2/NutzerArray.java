package Aufgabe2;

import javax.swing.*;
import java.util.Random;

public class NutzerArray {
    public static void main(String[] args) {



        int nutzerEingabe = Integer.parseInt(JOptionPane.showInputDialog("Eingabe"));

        int [] array1 = new int[nutzerEingabe];

        for (int i=0; i<nutzerEingabe; i++){
            Random random = new Random();
            int zufall = random.nextInt((1000)+1);
            array1[i]=zufall;
        }

        for (int j=0; j<nutzerEingabe; j++ ){
            System.out.println(array1[(array1.length -1) -j]);
        }
        for (int g:array1){
            System.out.println(g);
        }
    }
}
