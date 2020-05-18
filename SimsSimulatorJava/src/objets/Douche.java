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
            if (this.etat == "occupé") {
                System.out.println("Vous ne pouvez pas rentre, la douche est deja occupé");
            } else {
                this.etat = "occupé";
                System.out.println("Vous rentré dans la douche");
            }
        }
        else if (c == 1) {
            if (this.etat == "eau active") {
                System.out.println("L'eau est déja en train de couler");
            } else {
                this.etat = "eau active";
                System.out.println("Vous ouvre le robinet");
            }
        } else if (c == 2) {
            if (this.etat == "eau éteinte") {
                System.out.println("le robinet est déja fermé");
            } else {
                this.etat = "eau éteinte";
                System.out.println("Vous fermé le robinet");
            }
        }else if (c == 3) {
                if (this.etat == "disponible") {
                    System.out.println("Pour changer la temperature vous devez être dans la douche");
                } else {
                    this.etat = "occupé";
                    System.out.println("Vous augmentez la temperature");
                }
            }
            else if (c == 4) {
                if (this.etat == "disponible") {
                    System.out.println("Pour changer la temperature vous devez etre dans la douche");
                } else {
                    this.etat = "occupé";
                    System.out.println("Vous diminuez la temperature");
                }
            }else if (c == 5) {
                    if (this.etat == "disponible") {
                        System.out.println("Vous ne pouvez sortir d'un endroit alors que vous n'y êtes pas rentré");
                    } else {
                        this.etat = "disponible";
                        System.out.println("Vous quittez la douche");
                    }
                }
         else {
            System.out.println("Il ne se passe rien");
        }
    }

}