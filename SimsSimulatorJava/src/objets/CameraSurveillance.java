package objets;


public class CameraSurveillance extends Objet {
    
    public CameraSurveillance(){
       super("Camera de surveillance","en cours de fonctionnement");
       actions.add("Regarder les enregistrements");    //Ajout des Actions de Bases pour la camera
    }
    @Override
    public void realiserAction(int c) {
        if(c == 0){
            System.out.println("vous avez maintenant accès aux video enregistré");
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
    }
}