package commande.commandes;

import commande.objets.Tele;

/**
 * Commande permetant d'allumer une television ou de l'éteindre
 * grace a sa methode execute
 */
public class AllumerTeleCommande implements Commande {

    private Tele tele;
    public AllumerTeleCommande(Tele tele0) {
        if(tele0 == null){
            throw new IllegalArgumentException();
        }
        this.tele = tele0;
    }

    @Override
    public void execute() {
        if(!tele.isAllume()){
            tele.allumer();
        } else {
            tele.eteindre();
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
