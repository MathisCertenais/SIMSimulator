package objets;

public class Canape extends Objet {

    public Canape(){
       super("Canape","vide");
       actions.add("s'assoir sur le canapé");    //Ajout des Actions de Bases pour le canape
       actions.add("se lever du canapé");
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "occupe") {
                System.out.println("Vous êtes déja assis sur le canapé");
            } else {
                this.etat = "occupe";
                System.out.println("vous vous asseyez dans votre canape adoré");
            }
        } else if (c == 1) {
            if (this.etat == "vide") {
                System.out.println("Pour vous levez il faudrait deja y etre assis");
            } else {
                this.etat = "vide";
                System.out.println("Vous quittez votre canapé");
            }
        } else {
            System.out.println("Il ne se passe rien");
        }
    }
}