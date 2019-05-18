/*
 * Copyright (c) 2019.
 * Generate By Corentin Roux.
 * All rights reserved.
 */

package decorateur;
public class Main {
    // ______________________________________________________________________
    // Implémentation
    public static void main(String[] args) {
        Voiture ds = new DS();
        Voiture dsOption = new DSAvecToitOuvrantDecorator((DS) ds);
        System.out.println(dsOption.getPoids()+" - "+dsOption.getPrix());
    }
}
