package commande;

import commande.objets.Lampe;
import commande.objets.Tele;

public class Launcher {
    public static void main(String[] args) {
        Tele tele = new Tele();
        Lampe lampe = new Lampe();

        Telecommande telecommande = new Telecommande(tele, lampe);
        telecommande.pressButton(Telecommande.ALLUME_LAMPE);
        telecommande.pressButton(Telecommande.ALLUME_TELE);
        telecommande.pressButton(Telecommande.CHANGER_CHAINE);
        telecommande.undo();
        telecommande.undo();
        telecommande.undo();
    }
}
