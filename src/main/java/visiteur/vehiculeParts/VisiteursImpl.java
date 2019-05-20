package visiteur.vehiculeParts;

import visiteur.RapportControleTechnique;
import visiteur.vehiculeParts.identification.CarRegistrationDocument;
import visiteur.vehiculeParts.identification.ConstructorPlate;
import visiteur.vehiculeParts.identification.Identification;
import visiteur.vehiculeParts.identification.NumberPlate;

public class VisiteursImpl implements Visiteurs  {

    private RapportControleTechnique rapportControleTechnique;
    private String marqueV;
    private String marqueP;
    private String marqueC;
    private String plaqueImmatriculation;
    private String plaqueImmatriculationCarteGrise;
    private String numeroChassis;
    private String numeroChassisPlaque;
    private String numeroChassisCarteGrise;
    private int poidChargePlaque;
    private int poidChargeCarte;
    private int poidRoulantPlaque;
    private int poidRoulantCarte;
    private int nbrPlace;
    private int nbrPlaceCarte;


    public VisiteursImpl() {
        this.rapportControleTechnique = new RapportControleTechnique();
    }

    @Override
    public void visit(Steering steering) {
        if (!steering.isRackCondition()){
            this.rapportControleTechnique.ajoutPieceDef("Le Volant est mort !!");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        if (!steering.isWheelLock()){
            this.rapportControleTechnique.ajoutPieceDef("La Cremaillère est mort !!");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        if (!steering.isWhileCondition()){
            this.rapportControleTechnique.ajoutPieceDef("L'Anti-vole est mort !!");
            this.rapportControleTechnique.setStatus("Validé avec anomalies mineurs");
        }
    }

    @Override
    public void visit(Visibility visibility) {
        if (!visibility.isRearViewMirrorCondition()){
            this.rapportControleTechnique.ajoutPieceDef("Retro-Viseurs arrière est mort !!");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        if (!visibility.isWindScreenCondition()){
            this.rapportControleTechnique.ajoutPieceDef("Le Pare Prise est mort !!");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        for (boolean b: visibility.getWingViewsMirrorCondition()){
            if (!b){
                this.rapportControleTechnique.ajoutPieceDef("Retro-Viseurs latéral est mort !!");
                this.rapportControleTechnique.setStatus("Contre Visite");
            }
        }
        for (boolean b:visibility.getWipersCondition()){
            if (!b){
                this.rapportControleTechnique.ajoutPieceDef("L'Essuie glace est mort !!");
                this.rapportControleTechnique.setStatus("Contre Visite");
            }
        }
    }

    @Override
    public void visit(CarRegistrationDocument carRegistrationDocument) {
        this.nbrPlaceCarte = carRegistrationDocument.getNbPlace();
        this.numeroChassisCarteGrise = carRegistrationDocument.getBodyEngraving();
        this.poidChargeCarte = carRegistrationDocument.getpTAC();
        this.poidRoulantCarte = carRegistrationDocument.getpTRA();
        this.marqueC = carRegistrationDocument.getMake();
        this.plaqueImmatriculationCarteGrise = carRegistrationDocument.getRegistrationNumber();

    }

    @Override
    public void visit(ConstructorPlate constructorPlate) {
        this.marqueP = constructorPlate.getMake();
        this.numeroChassisPlaque = constructorPlate.getBodyEngraving();
        this.poidChargePlaque = constructorPlate.getpTAC();
        this.poidRoulantPlaque = constructorPlate.getpTRA();
    }

    @Override
    public void visit(Identification identification) {
        this.marqueV = identification.getMake();
        this.numeroChassis = identification.getBodyEngraving();
        this.nbrPlace = identification.getNbPlace();
        for (IMOTElement imotElement:identification.getMOTElements()){
            imotElement.accept(this);
        }
    }

    @Override
    public void visit(NumberPlate numberPlate) {
        if (!numberPlate.isCondition()){
            this.rapportControleTechnique.ajoutPieceDef("Plaque en mauvaise état !!");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        this.plaqueImmatriculation = numberPlate.getRegistrationNumber();
    }

    @Override
    public void visit(Breaking breaking) {
        if (!breaking.isBreakPedalCondition()){
            this.rapportControleTechnique.ajoutPieceDef("Plaque en mauvaise état !!");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        for (boolean b:breaking.getBreakDisksCondition()){
            if (!b){
                this.rapportControleTechnique.ajoutPieceDef("Pédale de frein en mauvaise état !!");
                this.rapportControleTechnique.setStatus("Contre Visite");
            }
        }
        for (boolean b:breaking.getBreakPadsCondition()){
            if (!b){
                this.rapportControleTechnique.ajoutPieceDef("Plaquette de frein en mauvaise état !!");
                this.rapportControleTechnique.setStatus("Contre Visite");
            }
        }

    }

    @Override
    public void visit(Car car) {
        for (IMOTElement imotElement:car.getmOTElements()){
            imotElement.accept(this);
        }
        //verif avec tous les champs recup
        this.verificationSuppl();
    }

    public void verificationSuppl(){
        if (this.nbrPlace != this.nbrPlaceCarte){
            this.rapportControleTechnique.ajoutPieceDef("Pas le meme nombre de place entre la carte et le réelle");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        if (!this.numeroChassis.equals(this.numeroChassisCarteGrise) || !this.numeroChassisPlaque.equals(this.numeroChassisCarteGrise)
            || !this.numeroChassis.equals(this.numeroChassisPlaque) ){
            this.rapportControleTechnique.ajoutPieceDef("Pas le meme num de carte");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        if (!this.marqueV.equals(this.marqueC) || !this.marqueP.equals(this.marqueC)||
                !this.marqueV.equals(this.marqueP)){
            this.rapportControleTechnique.ajoutPieceDef("Pas les meme plaques !!");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        if (!this.plaqueImmatriculation.equals(this.plaqueImmatriculationCarteGrise)){
            this.rapportControleTechnique.ajoutPieceDef("Pas la meme plaque d'immatriculation !!");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        if (this.poidRoulantPlaque != this.poidRoulantCarte){
            this.rapportControleTechnique.ajoutPieceDef("Pas le meme poid roulant");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
        if (this.poidChargeCarte != this.poidChargePlaque){
            this.rapportControleTechnique.ajoutPieceDef("Pas la meme poid charge !!");
            this.rapportControleTechnique.setStatus("Contre Visite");
        }
    }

    public RapportControleTechnique getRapportControleTechnique() {
        return rapportControleTechnique;
    }

}
