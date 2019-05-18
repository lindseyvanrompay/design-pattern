package etatV2.etat;


/**
 * Etat B
 * Implemente l interface EtatV2. EtatV2 place des exceptions par defauts pour chaque appel non Override
 */
public class EtatD implements EtatV2 {

    private final Context context;

    public EtatD(Context context) {
        this.context = context;
    }

    @Override
    public void goToA() {
        context.setEtat(new EtatA(context));
    }

    @Override
    public void goToB() {
        context.setEtat(new EtatB(context));

    }
}
