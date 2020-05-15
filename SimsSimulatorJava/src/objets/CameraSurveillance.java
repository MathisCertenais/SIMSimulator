package objets;


public class CameraSurveillance extends Objet {
    
    public CameraSurveillance(){
       super("Camera de surveillance","en cours de fonctionnement");
       actions.add("Regarder les enregistrements");    //Ajout des Actions de Bases pour la camera
    }
}