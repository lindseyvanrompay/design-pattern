/*
 * Copyright (c) 2019.
 * Generate By Corentin Roux.
 * All rights reserved.
 */

package prototype;

public class Cookie extends Exception implements Cloneable {
    @Override
    public Cookie clone(){
        try{
            Cookie copy = (Cookie)super.clone();
            // Dans une implémentation réelle de ce patron de conception, il faudrait
            // créer la copie en dupliquant les objets contenus et en attribuant des
            // valeurs valides (exemple : un nouvel identificateur unique pour la copie).
            return copy;
        }catch (CloneNotSupportedException e){
            return null;
        }
    }


}
