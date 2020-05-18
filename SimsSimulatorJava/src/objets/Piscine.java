package objets;

public class Piscine extends Objet {
    public Piscine(){
       super("Piscine","vide");
       actions.add("Rentrer dans la piscine");    //Ajout des Actions de Bases pour le canape
       actions.add("Sortir de la piscine")
    }

    @Override
    public void realiserAction(int c) {

        if (c == 0) {
            if (this.etat == "occupe") {
                System.out.println("La piscine est pleine");
            } else {
                this.etat = "occupe";
                System.out.println("vous rentré dans la piscine");
            }
        } else if (c == 1) {
            if (this.etat == "vide") {
                System.out.println("Pour sortir de la piscine il faut y être");
            } else {
                this.etat = "vide";
                System.out.println("Vous sortez de la piscine");
            }
        } else {
            System.out.println("Il ne se passe rien");
        }
    }
}