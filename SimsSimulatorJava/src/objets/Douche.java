package objets;


public class Douche extends Objet {
    
    public Douche(){
       super("Douche","disponible");
       actions.add("Entrer dans la douche");    //Ajout des Actions de Bases de la douche
       actions.add("Allumer l'eau");    
       actions.add("Eteindre l'eau");
       actions.add("Augmenter la temperature");
       actions.add("Diminuer la temperature");
       actions.add("Sortir de la douche");
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "occupe") {
                System.out.println("Vous ne pouvez pas rentre, la douche est deja occupe");
            } else {
                this.etat = "occupe";
                System.out.println("Vous rentre dans la douche");
            }
        }
        else if (c == 1) {
            if (this.etat == "eau active") {
                System.out.println("L'eau est deja en train de couler");
            } else {
                this.etat = "eau active";
                System.out.println("Vous ouvre le robinet");
            }
        } else if (c == 2) {
            if (this.etat == "eau eteinte") {
                System.out.println("le robinet est deja ferme");
            } else {
                this.etat = "eau eteinte";
                System.out.println("Vous ferme le robinet");
            }
        }else if (c == 3) {
                if (this.etat == "disponible") {
                    System.out.println("Pour changer la temperature vous devez etre dans la douche");
                } else {
                    this.etat = "occupe";
                    System.out.println("Vous augmenter la temperature");
                }
            }
            else if (c == 4) {
                if (this.etat == "disponible") {
                    System.out.println("Pour changer la temperature vous devez etre dans la douche");
                } else {
                    this.etat = "occupe";
                    System.out.println("Vous diminuer la temperature");
                }
            }else if (c == 5) {
                    if (this.etat == "disponible") {
                        System.out.println("Vous ne pouvez sortir d'une endroit alors que vous n'y etes pas rentre");
                    } else {
                        this.etat = "disponible";
                        System.out.println("Vous quitter la douche");
                    }
                }
         else {
            System.out.println("Il ne se passe rien");
        }
    }

}