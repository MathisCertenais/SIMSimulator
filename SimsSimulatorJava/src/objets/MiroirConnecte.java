package objets;


public class MiroirConnecte extends Objet {
    
    public MiroirConnecte(){
       super("Miroir connecte","allume");
       actions.add("allume le Miroir connecte");    //Ajout des Actions de Bases de le Miroir connecte
       actions.add("Changer la luminosité du miroir connecte");    
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "allume") {
                System.out.println("Le miroir est deja allume");
            } else {
                this.etat = "allume";
                System.out.println("Vous allume le mirroir connecte");
            }

        } else if (c == 1) {
            if (this.etat == "eteint") {
                System.out.println("Pour changer la luminosite, le miroir doit etre allume");
            } else {
                this.etat = "eteint";
                System.out.println("vous eteigner le mirroir connecte");
            }
        }else if (c == 2) {
            if (this.etat == "eteint") {
                System.out.println("le mirroir connecte est deja eteint");
            } else {
                this.etat = "eteint";
                System.out.println("vous eteigner le mirroir connecte");
            }
        }   else {
            System.out.println("Il ne se passe rien");
        }
    }
}