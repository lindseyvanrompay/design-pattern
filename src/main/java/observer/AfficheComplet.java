/*
 * Copyright (c) 2019.
 * Generate By Corentin Roux.
 * All rights reserved.
 */

package observer;

import java.util.Observable;
import java.util.Observer;

//Affiche en console de façon complète les informations (position et précision) du GPS.
public class AfficheComplet implements Observer {
    // Méthode appelée automatiquement lors d'un changement d'état du GPS.
    public void update(Observable o, Object obj)
    {
        if(o instanceof Gps)
        {
            Gps g = (Gps) o;
            System.out.println("Position : "+g.getPosition()+"  Précision : "+g.getPrecision()+"/10");
        }
    }

    public AfficheComplet(Gps g) {
        g.addObserver(this);
    }
}