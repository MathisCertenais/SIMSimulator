package objets;


public class Frigo extends Objet {
    
    public Frigo(){
       super("Frigo","Ferme");
       actions.add("Ouvrir le frigo");    //Ajout des Actions de Bases de le frigo
       actions.add("Fermer le frigo"); 
      
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "ouvert") {
                System.out.println("Le frigo est deja ouvert");
            } else {
                this.etat = "ouvert";
                System.out.println("Vous ouvre Le frigo");
            }
        } else if (c == 0) {
            if (this.etat == "ferme") {
                System.out.println("Le frigo est deja ferme");
            } else {
                this.etat = "ferme";
                System.out.println("vous ferme Le frigo");
            }
        }   else {
            System.out.println("Il ne se passe rien");
        }
    }
}