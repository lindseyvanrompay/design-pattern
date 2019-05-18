package commande.commandes;

import commande.objets.Tele;

public class ChangerChaineTeleCommande implements Commande {
    private Tele tele;

    public ChangerChaineTeleCommande(Tele tele) {
        this.tele = tele;
    }

    @Override
    public void execute() {
        if(!tele.isAllume()){
            throw new IllegalStateException("La tele doit etre allumee !");
        } else {
            tele.incChaine();
        }
    }

    @Override
    public void undo() {
        tele.decChaine();
    }
}
