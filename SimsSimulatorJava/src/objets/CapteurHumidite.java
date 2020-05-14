package objets;

import java.util.LinkedList;
import java.util.Random;

public class CapteurHumidite extends Objet {
    
    public CapteurHumidite(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Obtenir la valeur du capteur");    //Ajout des Actions de Bases pour le capteur d'humidite
    }
    
    public static double getHumi(double min, double max){
        double valeur = nbAlea(min,max);
        return valeur;
    }
    private static double nbAlea(double min, double max){
        Random r = new Random();
        int entier = (int)min + r.nextInt((int)max - (int)min);
        r = new Random();
        double decimal = 0 + r.nextInt(100 - 0);
        return entier+(decimal/100);
    }
}