package objets;

public class RobotRangement extends Objet {
    
    public RobotRangement(){
       super("Robot de rangement","Desactiver");
       actions.add("Activer le robot rangement");    //Ajout des Actions de Bases de le robot rangement
       actions.add("Desactiver le robot rangement");
    }

    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "allumée"){
                System.out.println("Le robot de rangement est déjà allumé");
            }
            else {
                this.etat = "allumée";
                System.out.println("Le robot de rangement s'allume");
            }
        }
        else if(c == 1){
            if(this.etat == "éteinte"){
                System.out.println("Le robot de rangement est déjà éteint");
            }
            else {
                this.etat = "éteinte";
                System.out.println("Le robot de rangement s'éteint");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
}