package objets;

import java.util.LinkedList;

public class SecheLinge extends Objet {
    
    public SecheLinge(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("utiliser le seche linge");    //Ajout des Actions de Bases de le seche linge
    }
}