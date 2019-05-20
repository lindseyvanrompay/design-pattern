package visiteur.vehiculeParts;

public class Visibility implements IMOTElement {

    /**
     * Par-brise
     */
    private boolean windScreenCondition;

    /**
     * Rétroviseur arrière
     */
    private boolean rearViewMirrorCondition;

    /**
     * Rétroviseurs latéraux (0 : Droite, 1 : Gauche)
     */
    private boolean [] wingViewsMirrorCondition;

    /**
     * Essuie-Glace (0 : Avant, 1 : Arriere)
     */
    private boolean [] wipersCondition;

    public Visibility(boolean windScreenCondition, boolean rearViewMirrorCondition, boolean[] wingViewsMirrorCondition, boolean[] wipersCondition) {
        this.windScreenCondition = windScreenCondition;
        this.rearViewMirrorCondition = rearViewMirrorCondition;
        this.wingViewsMirrorCondition = wingViewsMirrorCondition;
        this.wipersCondition = wipersCondition;
    }

    public boolean isWindScreenCondition() {
        return windScreenCondition;
    }

    public boolean isRearViewMirrorCondition() {
        return rearViewMirrorCondition;
    }

    public boolean[] getWingViewsMirrorCondition() {
        return wingViewsMirrorCondition;
    }

    public boolean[] getWipersCondition() {
        return wipersCondition;
    }

    @Override
    public void accept(Visiteurs v) {
        v.visit(this);
    }
}
