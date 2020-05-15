package objets;

public class SondeTemperature extends Objet {
    
    public SondeTemperature(){
        super("Sonde de temperature","Active");
        actions.add("Regarder la valeure de temperature"); //Ajout des Actions de Bases de la sonde temperature
    }
}