package objets;

import java.util.LinkedList;

public class Thermostat extends Objet {
    
    public Thermostat(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Utiliser le thermostat (fixer une temperature)");    //Ajout des Actions de Bases de le thermostat
    }
}