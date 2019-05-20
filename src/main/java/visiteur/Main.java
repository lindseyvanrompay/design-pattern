package visiteur;

import visiteur.vehiculeParts.*;
import visiteur.vehiculeParts.identification.CarRegistrationDocument;
import visiteur.vehiculeParts.identification.ConstructorPlate;
import visiteur.vehiculeParts.identification.Identification;
import visiteur.vehiculeParts.identification.NumberPlate;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<IMOTElement> identificationElements = new ArrayList<>();
        identificationElements.add(new NumberPlate("387-GJ-25", true));
        identificationElements.add(new ConstructorPlate("Citroën", "1882574748", 930, 1330));
        identificationElements.add(new CarRegistrationDocument("387-GJ-25", "Citroën", "1882574748", 930, 1330, 4));

        ArrayList<IMOTElement> carElements = new ArrayList<>();
        carElements.add(new Identification("Citroën",  "1882574748", 4, identificationElements));
        boolean[] pads = {true, true, true, true};
        boolean[] disks = {true, true, true, true};
        carElements.add(new Breaking(true, pads, disks));
        carElements.add(new Steering(true, true, true));
        boolean[] wingViews = {true, true};
        boolean[] wipers = {true, true};
        carElements.add(new Visibility(true, true, wingViews, wipers));

        Car deuxChevauw = new Car(carElements);

        VisiteursImpl visiteurs = new VisiteursImpl();

        visiteurs.visit(deuxChevauw);

        RapportControleTechnique rapportControleTechnique = visiteurs.getRapportControleTechnique();

        System.out.println("Statut de la visite : "+rapportControleTechnique.getStatus());

        for (String s : rapportControleTechnique.getPieceDefaillante()){
            System.out.println(s);
        }

        System.out.println("Fin du rapport !!");

    }


}
