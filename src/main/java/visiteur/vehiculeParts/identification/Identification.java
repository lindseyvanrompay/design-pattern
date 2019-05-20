package visiteur.vehiculeParts.identification;

import visiteur.vehiculeParts.IMOTElement;
import visiteur.vehiculeParts.Visiteurs;

import java.util.ArrayList;

public class Identification implements IMOTElement {

    /**
     * Liste des éléments complétés pour l'identification
     */
    private ArrayList<IMOTElement> mOTElements;

    /**
     * Marque du constructeur du vehicule
     */
    private String make;

    /**
     * Gravure du châssis
     */
    private String bodyEngraving;

    /**
     * Nombre de place dans la vehicule
     */
    private int nbPlace;

    public Identification(String make, String bodyEngraving, int nbPlace, ArrayList<IMOTElement> mOTElements) {
        this.make = make;
        this.bodyEngraving = bodyEngraving;
        this.nbPlace = nbPlace;
        this.mOTElements = mOTElements;
    }
	
	public ArrayList<IMOTElement> getMOTElements() {
		return mOTElements;
	}

    public String getMake() {
        return make;
    }

    public String getBodyEngraving() {
        return bodyEngraving;
    }

    public int getNbPlace() {
        return nbPlace;
    }
    @Override
    public void accept(Visiteurs v) {
        v.visit(this);
    }
}
