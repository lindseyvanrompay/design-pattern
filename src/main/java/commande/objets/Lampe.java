package commande.objets;


/**
 * Une lampe qui s'allume et qui s'éteint
 */
public class Lampe {
    private boolean isAllume = false;

    public void allumer(){
        if(!isAllume) {
            System.out.println("Allumage de la lampe");
            isAllume = true;
        } else {
            System.out.println("La lampe est deja allume");
        }
    }

    public void eteindre(){
        if(isAllume) {
            System.out.println("Eteignage la lampe");
            isAllume = false;
        } else {
            System.out.println("La lampe est deja eteinte !");
        }
    }

    public boolean isAllumer(){
        return this.isAllume;
    }
}
