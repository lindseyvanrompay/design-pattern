package commande.commandes;

public interface Commande {
    public void execute();

    void undo();
}
