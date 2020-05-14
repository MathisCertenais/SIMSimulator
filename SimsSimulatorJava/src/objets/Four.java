package objets;

import java.util.LinkedList;

public class Four extends Objet {
    
    public Four(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("allumer le four");    //Ajout des Actions de Bases de le four
       actions.add("utiliser le four"); 
       actions.add("eteindre le four"); 
    }
}