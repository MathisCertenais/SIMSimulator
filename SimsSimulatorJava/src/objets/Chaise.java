package objets;

public class Chaise extends Objet {

    public Chaise(){
       super("Chaise","disponible");
       actions.add("s'assoir sur La chaise");    //Ajout des Actions de Bases pour la chaise
       actions.add("se lever de la chaise");
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "occupé") {
                System.out.println("La chaise est deja occupé");
            } else {
                this.etat = "occupe";
                System.out.println("vous vous asseyez dans votre chaise");
            }
        } else if (c == 1) {
            if (this.etat == "disponible") {
                System.out.println("Pour vous levez il faudrait deja être assis");
            } else {
                this.etat = "disponible";
                System.out.println("Vous vous levez de votre chaise");
            }
        } else {
            System.out.println("Il ne se passe rien");
        }
    }
}