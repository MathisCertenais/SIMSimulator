package objets;

import java.util.LinkedList;

public class Hotte extends Objet {
    
    public Hotte(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Allumer le hotte");    //Ajout des Actions de Bases de le hotte
       actions.add("Eteindre le hotte"); 
    }
}