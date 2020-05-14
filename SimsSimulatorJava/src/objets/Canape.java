package objets;

import java.util.LinkedList;

public class Canape extends Objet {
    
    public Canape(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("s'assoir sur le canape");    //Ajout des Actions de Bases pour le canape
    }
}