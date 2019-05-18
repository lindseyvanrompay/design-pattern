package commande.commandes;

import commande.objets.Tele;

/**
 * Commande qui stocke une tele et qui incremente sa chaine lors de execute()
 */
public class ChangerChaineTeleCommande implements Commande {
    private Tele tele;

    public ChangerChaineTeleCommande(Tele tele) {
        this.tele = tele;
    }

    /**
     * Augmente la chaine de 1
     */
    @Override
    public void execute() {
        if(!tele.isAllume()){
            throw new IllegalStateException("La tele doit etre allumee !");
        } else {
            tele.incChaine();
        }
    }

    /**
     * Decremente la chaine de 1
     */
    @Override
    public void undo() {
        if(tele.getChaineTV() == 0){
            throw new IllegalStateException("Une chaine TV ne peut pas être negative");
        }
        tele.decChaine();
    }
}
