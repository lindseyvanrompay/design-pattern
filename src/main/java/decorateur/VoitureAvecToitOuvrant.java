/*
 * Copyright (c) 2019.
 * Generate By Corentin Roux.
 * All rights reserved.
 */

package decorateur;

class VoitureAvecToitOuvrant extends VoitureAvecOption {

    int getPrix() {return voiture.getPrix() + 10000;}
    int getPoids() {return voiture.getPoids() + 15;}
}

