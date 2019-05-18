/*
 * Copyright (c) 2019.
 * Generate By Corentin Roux.
 * All rights reserved.
 */

package observer;

import java.util.Observable;
import java.util.Observer;

//Affiche un résumé en console des informations (position) du GPS.
public class AfficheResume implements Observer {
    // Méthode appelée automatiquement lors d'un changement d'état du GPS.
    public void update(Observable o, Object obj)
    {
        if(o instanceof Gps)
        {
            Gps g = (Gps) o;
            System.out.println("Position : "+g.getPosition());
        }
    }

    public AfficheResume(Gps g) {
        g.addObserver(this);
    }
}