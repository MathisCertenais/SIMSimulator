package objets;

import java.util.LinkedList;

public class PC extends Objet {
    
    public PC(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Allumer le PC");    //Ajout des Actions de Bases de le PC
       actions.add("Eteindre le PC");
    }
}