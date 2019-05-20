package visiteur.vehiculeParts.identification;

import visiteur.vehiculeParts.IMOTElement;
import visiteur.vehiculeParts.Visiteurs;

public class NumberPlate implements IMOTElement {

    /**
     * Numéro d'immatriculation
     */
    private String registrationNumber;

    /**
     * Vrai si la plaque est en bon état
     */
    private boolean condition;

    public NumberPlate(String registrationNumber, boolean condition) {
        this.registrationNumber = registrationNumber;
        this.condition = condition;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isCondition() {
        return condition;
    }
    @Override
    public void accept(Visiteurs v) {
        v.visit(this);
    }
}
