package commande;

import commande.commandes.AllumerLampeCommande;
import commande.commandes.AllumerTeleCommande;
import commande.commandes.ChangerChaineTeleCommande;
import commande.commandes.Commande;
import commande.objets.Lampe;
import commande.objets.Tele;

import java.util.ArrayList;
import java.util.List;

/**
 * Une classe avec des boutons.
 * Chaque bouton possède une méthode : excecute
 */
class Telecommande {
    // Ou un tableau pour placer les commandes à un numero precis
    private List<Commande> commandes = new ArrayList<>();
    private List<Commande> commandesHistory = new ArrayList<>();

    static final int ALLUME_LAMPE = 0, ALLUME_TELE=1, CHANGER_CHAINE=2;

    /**
     * On passe en argument les objet necessaire a la telecommande
     * @param tele une tele
     * @param lampe une lampe
     */
    Telecommande(Tele tele, Lampe lampe) {
        commandes.add(new AllumerLampeCommande(lampe));
        commandes.add(new AllumerTeleCommande(tele));
        commandes.add(new ChangerChaineTeleCommande(tele));
    }


    /**
     * On execute la commande associee au numero donnee en argument
     * puis on la stocke dans un historique
     * @param numButton
     */
    void pressButton(int numButton){
        if(numButton > commandes.size()){
            throw new IllegalArgumentException("Bouton inexistant !");
        } else {
            commandes.get(numButton).execute();

            commandesHistory.add(
                    commandes.get(numButton)
            );
        }
    }

    /**
     * On retire la derniere action de l'historique et on l'annule avec undo()
     */
    void undo(){
        int dernierElem = commandesHistory.size()-1;
        if(dernierElem < 0){
            throw new UnsupportedOperationException("Il n'y a pas de derniere commande !");
        }

        commandesHistory.remove(dernierElem).undo();
    }
}
