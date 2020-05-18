package objets;
import java.util.Random;

public class SondeHumidite extends Objet {
    
    public SondeHumidite(){
        super("Sonde d'humidité","Active");
        actions.add("Regarder la valeur d'humidite");    //Ajout des Actions de Bases de la sonde humidite
    }

    public void realiserAction(int c) {
            System.out.println("Vous regardez la valeur de la sonde d'humidité:"+getHumi(22,24)); 
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
