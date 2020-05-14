package objets;

import java.util.LinkedList;

public class Tele extends Objet {
    
    public Tele(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Allumer la tele");    //Ajout des Actions de Bases de la tele
       actions.add("Eteindre la tele");
       actions.add("Changer de chaine sur la tele");
    }
}