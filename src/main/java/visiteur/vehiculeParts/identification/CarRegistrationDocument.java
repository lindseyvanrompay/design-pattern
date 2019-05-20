package visiteur.vehiculeParts.identification;

import visiteur.vehiculeParts.IMOTElement;
import visiteur.vehiculeParts.Visiteurs;

public class CarRegistrationDocument implements IMOTElement {

    /**
     * Numéro d'immatriculation
     */
    private String registrationNumber;

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

    /**
     * Nombre de place dans la vehicule
     */
    private int nbPlace;

    public CarRegistrationDocument(String registrationNumber, String make, String bodyEngraving, int pTAC, int pTRA, int nbPlace) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.bodyEngraving = bodyEngraving;
        this.pTAC = pTAC;
        this.pTRA = pTRA;
        this.nbPlace = nbPlace;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
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

    public int getNbPlace() {
        return nbPlace;
    }
    @Override
    public void accept(Visiteurs v) {
        v.visit(this);
    }
}
