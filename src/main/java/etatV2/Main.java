package etatV2;

import etatV2.etat.EtatMain;
import etatV2.etat.EtatV2;

public class Main {

    public static void main(String[] args) {
        EtatMain etatMain = new EtatMain();

        etatMain.goToB();

        etatMain.goToC();

        etatMain.goToA();

        try {
            etatMain.goToD();
        } catch (IllegalStateException e){
            e.printStackTrace();
            System.out.println("La regle dit de ne pas sauter plus de 2 lettres, d'ou l'exception");
        }
    }
}
