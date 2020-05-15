package objets;

public class Canape extends Objet {

    public Canape(){
       super("Canape","vide");
       actions.add("s'assoir sur le canape");    //Ajout des Actions de Bases pour le canape
       actions.add("se lever du canape");
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "occupe") {
                System.out.println("Le canape est deja occupe");
            } else {
                this.etat = "occupe";
                System.out.println("vous vous asseye dans votre canape adore");
            }
        } else if (c == 1) {
            if (this.etat == "vide") {
                System.out.println("Pour vous levez il faudrait deja que y etre assis");
            } else {
                this.etat = "vide";
                System.out.println("Vous quitte votre canape");
            }
        } else {
            System.out.println("Il ne se passe rien");
        }
    }
}