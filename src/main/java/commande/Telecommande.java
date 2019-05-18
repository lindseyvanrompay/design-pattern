package commande;

import commande.commandes.AllumerLampeCommande;
import commande.commandes.AllumerTeleCommande;
import commande.commandes.ChangerChaineTeleCommande;
import commande.commandes.Commande;
import commande.objets.Lampe;
import commande.objets.Tele;

import java.util.ArrayList;

/**
 * Une classe avec des boutons.
 * Chaque bouton possède une méthode : excecute
 */
public class Telecommande {
    // Ou un tableau pour placer les commandes à un numero precis
    private ArrayList<Commande> commandes = new ArrayList<>();
    private ArrayList<Commande> commandesHistory = new ArrayList<>();
    public static final int ALLUME_LAMPE = 0, ALLUME_TELE=1, CHANGER_CHAINE=2;

    private Tele tele;
    private Lampe lampe;

    public Telecommande(Tele tele, Lampe lampe) {
        this.tele = tele;
        this.lampe = lampe;

        commandes.add(new AllumerLampeCommande(lampe));
        commandes.add(new AllumerTeleCommande(tele));
        commandes.add(new ChangerChaineTeleCommande(tele));
    }

    public void pressButton(int numButton){
        if(numButton > commandes.size()){
            throw new IllegalArgumentException("Bouton inexistant !");
        } else {
            commandes.get(numButton).execute();

            commandesHistory.add(
                    commandes.get(numButton)
            );
        }
    }

    public void undo(){
        int dernierElem = commandesHistory.size()-1;
        if(dernierElem < 0){
            throw new UnsupportedOperationException("Il n'y a pas de derniere commande !");
        }

        Commande commande = commandesHistory.remove(dernierElem);
        commande.undo();
    }
}
