package objets;

import java.util.LinkedList;

public class PompeAChaleur extends Objet {
    
    public PompeAChaleur(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Allumer la pompe a chaleur");    //Ajout des Actions de Bases de la pompe a chaleur
       actions.add("Eteindre la pompe a chaleur");
       
    }
}