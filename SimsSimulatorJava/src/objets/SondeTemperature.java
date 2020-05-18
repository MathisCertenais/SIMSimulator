package objets;

import java.util.Random;

public class SondeTemperature extends Objet {
    
    public SondeTemperature(){
        super("Sonde de temperature","Active");
        actions.add("Regarder la valeur de temperature"); //Ajout des Actions de Bases de la sonde temperature
    }

    @Override
    public void realiserAction(int c) {
            System.out.println("Vous regardez la valeur de la sonde de température :"+getTemp(22,24)); 
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