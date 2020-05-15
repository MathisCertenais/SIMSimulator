package objets;


public class AspirateurAutonome extends Objet {
    
    public AspirateurAutonome(){
       super("AspirateurAutonome","a l'arret");
       actions.add("Demarrer l'aspirateur");            //Ajout des Actions de Bases pour l'aspirateur
       actions.add("Arreter l'aspirateur"); 
    }
}