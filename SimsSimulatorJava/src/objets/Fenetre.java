package objets;


public class Fenetre extends Objet {
    
    public Fenetre(){
       super("Fenetre","Ferme");
       actions.add("Ouvrir la fenêtre");    //Ajout des Actions de Bases de la fenêtre
       actions.add("Fermer la fenêtre");
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "ouverte") {
                System.out.println("La fenetre est deja ouverte");
            } else {
                this.etat = "ouverte";
                System.out.println("Vous ouvre la fenetre");
            }
        } else if (c == 0) {
            if (this.etat == "ferme") {
                System.out.println("la fenetre est deja ferme");
            } else {
                this.etat = "ferme";
                System.out.println("vous ferme la fenetre");
            }
        }   else {
            System.out.println("Il ne se passe rien");
        }
    }
    
}