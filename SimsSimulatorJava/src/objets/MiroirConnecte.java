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
                System.out.println("Le miroir est deja allumé");
            } else {
                this.etat = "allume";
                System.out.println("Vous allumez le mirroir connecté");
            }

        } else if (c == 1) {
            if (this.etat == "eteint") {
                System.out.println("Pour changer la luminosité, le miroir doit etre allumé");
            } else {
                this.etat = "eteint";
                System.out.println("vous eteignez le mirroir connecté");
            }
        }else if (c == 2) {
            if (this.etat == "eteint") {
                System.out.println("le mirroir connecté est déja eteint");
            } else {
                this.etat = "eteint";
                System.out.println("vous eteignez le mirroir connecté");
            }
        }   else {
            System.out.println("Il ne se passe rien");
        }
    }
}