package objets;

import java.util.LinkedList;

public class PhilipsHue extends Objet {
    
    public PhilipsHue(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Allumer l'ampoule Philips Hue");    //Ajout des Actions de Bases de l'ampoule Philips Hue
       actions.add("Eteindre l'ampoule Philips Hue");
    }
}