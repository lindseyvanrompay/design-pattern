package commande.commandes;

import commande.objets.Lampe;


/**
 * Commande permetant d'allumer une lampe ou de l'éteindre
 * grace a sa methode execute
 */
public class AllumerLampeCommande implements Commande {
    private Lampe lampe;

    public AllumerLampeCommande(Lampe lampe0) {
        if(lampe0 == null){
            throw new IllegalArgumentException();
        }
        this.lampe = lampe0;
    }

    @Override
    public void execute() {
        if(lampe.isAllumer()) {
            lampe.eteindre();
        } else {
            lampe.allumer();
        }
    }

    /**
     * Annule la derniere action
     * Dans ce cas present, c'est juste un nouvel appel à execute
     */
    @Override
    public void undo() {
        this.execute();
    }
}
