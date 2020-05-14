package objets;

import java.util.LinkedList;

public class LaveLinge extends Objet {
    
    public LaveLinge(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("utiliser le Lave linge");    //Ajout des Actions de Bases de le Lave linge
         
    }
}