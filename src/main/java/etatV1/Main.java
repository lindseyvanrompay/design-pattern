package etatV1;

import etatV1.etat.Etat;
import etatV1.etat.FeuVert;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        // Création de feux tricolores possédent un etat
        Feu feu = new Feu("Feu 1");
        Feu feu1 = new Feu("Feu 2");
        Feu feu2 = new Feu("Feu 3");

        // Chaque feu fonctionne sur son propre Thread
        Thread t = new Thread(feu);
        Thread t1 = new Thread(feu1);
        Thread t2 = new Thread(feu2);


        t.start();
        t1.start();
        t2.start();
    }

}
