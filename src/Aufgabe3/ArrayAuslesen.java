package Aufgabe3;

import javax.swing.*;
import java.util.Random;

public class ArrayAuslesen {

    static int []array = new int[100];
    static int a;
    static  int b;


   public static void main(String[] args) {

       for (int i = 0; i < 100; i++) {
           Random random = new Random();
           int zufall = random.nextInt((10) + 1);

           array[i] = zufall;
            }


       auslesen();
       System.out.println("--------------");


    }
    public static void auslesen(){

        boolean keineZahl = false;
        try {

            while (!keineZahl){
                a = Integer.parseInt(JOptionPane.showInputDialog("Welche stelle wollen Sie ansehen"));
                JOptionPane.showMessageDialog(null,"der Wert an Stelle "+a+" lautet "+array[a-1]);
                String jaNein = JOptionPane.showInputDialog(null,"Wollen sie den Wert an der Stelle "+a+" ändern? dann geben sie ja ein");

                if(jaNein.contains("ja")){
                    b = Integer.parseInt(JOptionPane.showInputDialog("Welchen Wert wollen Sie der stelle "+a+" zuweisen?"));
                    array[a-1]=b;
                }
                else {
                    JOptionPane.showMessageDialog(null,"Okey dann nicht");
                    keineZahl = true;
                }
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Keine Zahl");
            keineZahl = true;

            for(int g: array){
                System.out.println(g);
            }
        }


    }

}
