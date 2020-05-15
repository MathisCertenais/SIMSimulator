package objets;


public class RobotTracteur extends Objet {

    
    public RobotTracteur(){
       super("Robot de rangement","Desactiver");
       actions.add("Activer le robot tracteur");    //Ajout des Actions de Bases du robot tracteur
       actions.add("Desactiver le robot tracteur");
    }
}