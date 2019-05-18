package etatV2;

import etatV2.etat.EtatMain;
import etatV2.etat.EtatV2;

public class Main {

    public static void main(String[] args) {
        // Nouveau contexte d etat. Place a l etat A
        EtatMain etatMain = new EtatMain();

        // A a B OK
        etatMain.goToB();

        // B a C OK
        etatMain.goToC();

        // C a A OK
        etatMain.goToA();

        try {
            // A a D NOK
            etatMain.goToD();
        } catch (IllegalStateException e){
            e.printStackTrace();
            System.out.println("La regle dit de ne pas sauter plus de 2 lettres");
        }
    }
}
