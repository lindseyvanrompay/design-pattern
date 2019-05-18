package etatV2.etat;

/**
 * Etat B
 * Implemente l interface EtatV2. EtatV2 place des exceptions par defauts pour chaque appel non Override
 */
public class EtatB implements EtatV2{
    private final Context context;

    public EtatB(Context context) {
        this.context = context;
    }

    @Override
    public void goToC() {
        context.setEtat(new EtatC(context));
    }

    @Override
    public void goToD() {
        context.setEtat(new EtatD(context));
    }
}
