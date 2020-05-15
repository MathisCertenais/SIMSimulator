package objets;

public class Thermostat extends Objet {
    
    public Thermostat(){
       super("Ampoule PhilipsHue", "Allumé");
       actions.add("Regler la température");    //Ajout des Actions de Bases de l'ampoule
    }
