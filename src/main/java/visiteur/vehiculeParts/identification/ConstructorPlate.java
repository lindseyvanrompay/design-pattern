package visiteur.vehiculeParts.identification;

import visiteur.vehiculeParts.IMOTElement;
import visiteur.vehiculeParts.Visiteurs;

public class ConstructorPlate implements IMOTElement {

    /**
     * Marque du constructeur du vehicule
     */
    private String make;

    /**
     * Gravure du châssis
     */
    private String bodyEngraving;

    /**
     * Poids total autorisé en charge (PTAC)
     */
    private int pTAC;

    /**
     * Poids total roulant autorisé (PTRA)
     */
    private int pTRA;

    public ConstructorPlate(String make, String bodyEngraving, int pTAC, int pTRA) {
        this.make = make;
        this.bodyEngraving = bodyEngraving;
        this.pTAC = pTAC;
        this.pTRA = pTRA;
    }

    public String getMake() {
        return make;
    }

    public String getBodyEngraving() {
        return bodyEngraving;
    }

    public int getpTAC() {
        return pTAC;
    }

    public int getpTRA() {
        return pTRA;
    }
    @Override
    public void accept(Visiteurs v) {
        v.visit(this);
    }
}
