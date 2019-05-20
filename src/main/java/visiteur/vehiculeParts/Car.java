package visiteur.vehiculeParts;

import java.util.ArrayList;

public class Car implements IMOTElement {

    /**
     * Liste des éléments vérifiés
     */
    private ArrayList<IMOTElement> mOTElements;

    public Car(ArrayList<IMOTElement> mOTElements) {
        this.mOTElements = mOTElements;
    }

    public ArrayList<IMOTElement> getmOTElements() {
        return mOTElements;
    }


    @Override
    public void accept(Visiteurs v) {
        v.visit(this);
    }
}
