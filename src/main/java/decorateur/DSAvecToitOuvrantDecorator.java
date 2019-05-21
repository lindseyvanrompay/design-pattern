package decorateur;
class DSAvecToitOuvrantDecorator extends VoitureAvecToitOuvrant{
    public DSAvecToitOuvrantDecorator(DS ds) {
        this.voiture = ds;
    }
}
