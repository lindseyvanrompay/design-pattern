/*
 * Copyright (c) 2019.
 * Generate By Corentin Roux.
 * All rights reserved.
 */

package observer;

//Classe principale du projet observeurApi.
public class Main
{
    // Méthode principale.
    public static void main(String[] args)
    {
        // Création de l'objet Gps observable.
        Gps g = new Gps();
        // Création de deux observeurs AfficheResume et AfficheComplet
        AfficheResume ar = new AfficheResume(g);
        AfficheComplet ac = new AfficheComplet(g);

        // On ajoute AfficheResume comme observeur de Gps.
        //g.addObserver(ar);

        // On simule l'arrivée de nouvelles valeurs via des capteurs.
        g.setMesures("N 39°59°993 / W 123°00°000", 4);

        // On ajoute AfficheComplet comme observeur de Gps.
        //g.addObserver(ac);

        // Nouvelle simulation d'arrivée de nouvelles valeurs via des capteurs.
        g.setMesures("N 37°48°898 / W 124°12°011", 5);
    }
}



