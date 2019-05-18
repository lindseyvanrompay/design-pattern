package commande.objets;



/**
 * Une tele qui s'allume et qui s'éteint
 */
public class Tele {
    private boolean isAllume = false;
    private int chaineTV = 0;


    public void allumer(){
        if(!isAllume) {
            System.out.println("Allumage de la tele");
            isAllume = true;
        } else {
            System.out.println("La lampe est deja allume");
        }
    }

    public void eteindre(){
        if(isAllume) {
            System.out.println("Eteignage la tele");
            isAllume = false;
        } else {
            System.out.println("La lampe est deja eteinte !");
        }
    }

    public void incChaine(){
        System.out.println("La chaine TV est actuellement : " + ++chaineTV);
    }

    public void decChaine() {
        System.out.println("La chaine TV est actuellement : " + --chaineTV);
    }

    public int getChaineTV(){
        return chaineTV;
    }

    public boolean isAllume(){
        return isAllume;
    }


}
