package observer;

import java.util.Observable;

//Classe représentant un GPS (appareil permettant de connaître sa position).
public class Gps extends Observable
{
    private String position;// Position du GPS.
    private int precision;// Précision accordé à cette position (suivant le nombre de satellite utilisés).

    // Constructeur.
    public Gps()
    {
        position="inconnue";
        precision=0;
    }

    // Méthode permettant de notifier tous les observateurs lors d'un changement d'état du GPS.
    public void notifierObservateurs()
    {
        setChanged();// Méthode de l'API.
        notifyObservers();// Egalement une méthode de l'API.
    }

    // Méthode qui permet de mettre à jour de façon artificielle le GPS.
    // Dans un cas réel, on utiliserait les valeurs retournées par les capteurs.
    public void setMesures(String position, int precision)
    {
        this.position=position;
        this.precision=precision;
        notifierObservateurs();
    }

    // Méthode "tiré" donc c'est aux observeurs d'aller chercher les valeurs désiré grâce à un objet Gps.
    // Pour cela on trouve un accesseur en lecture pour position.
    public String getPosition()
    {
        return position;
    }
    // Un accesseur en lecture pour précision.
    public int getPrecision()
    {
        return precision;
    }
}