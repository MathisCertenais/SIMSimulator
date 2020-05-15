package objets;

public class RobotRangement extends Objet {
    
    public RobotRangement(){
       super("Robot de rangement","Desactiver");
       actions.add("Activer le robot rangement");    //Ajout des Actions de Bases de le robot rangement
       actions.add("Desactiver le robot rangement");
    }
}