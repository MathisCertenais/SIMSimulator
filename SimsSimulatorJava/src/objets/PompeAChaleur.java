package objets;

import java.util.LinkedList;

public class PompeAChaleur extends Objet {
    
    public PompeAChaleur(){
       super("Pompe à Chaleur", "éteinte");
       actions.add("Allumer la pompe a chaleur");    //Ajout des Actions de Bases de la pompe a chaleur
       actions.add("Eteindre la pompe a chaleur");
       
    }
}