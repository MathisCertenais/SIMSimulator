package objets;

import java.util.Random;

public class CapteurHumidite extends Objet {
    
    public CapteurHumidite(){
       super("Capteur d'humidite","en place");
       actions.add("Obtenir la valeur du capteur");    //Ajout des Actions de Bases pour le capteur d'humidite
    }

    @Override
    public void realiserAction(int c) {
            System.out.println("Vous regardez la valeur du capteur:"+getHumi(22,24)); 
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