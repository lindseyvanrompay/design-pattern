package etatV2.etat;


/**
 * Classe principale
 *
 * Chaque méthode est succeptible de lancer une IllegalStateException.
 * IllegalState = RunTimeException (exception non controlle). Pas de try catch obligatoire
 * Ca ne veut pas dire qu il ne faut pas en mettre.
 */
public class EtatMain implements EtatV2, Context{
    private EtatV2 etat;

    public EtatMain(){
        etat = new EtatA(this);
    }

    @Override
    public void goToA() {
        etat.goToA();
    }

    @Override
    public void goToB() {
        etat.goToB();
    }

    @Override
    public void goToC() {
        etat.goToC();
    }

    @Override
    public void goToD() {
        etat.goToD();
    }

    @Override
    public void setEtat(EtatV2 etat) {
        this.etat = etat;
    }
}
