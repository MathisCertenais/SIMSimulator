package objets;

import java.util.Random;

public class CapteurTemperature extends Objet {
    
    public CapteurTemperature(){
       super("Capteur de temperature","en place");
       actions.add("Obtenir la valeur du capteur");    //Ajout des Actions de Bases pour le capteur de temperature
    }
    
    public static double getTemp(double min, double max){
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