
public class launcher {

public static void main(String[] args) {
    Maison maison = Initialisation.initialiser();
    System.out.println("Bienvenue dans notre Maison");
    System.out.println("Vous êtes actuellement dans la pièce " + maison.getPiece().getNom() 
        + " à l'étage " + maison.getEtage().getNom());
    System.out.println("Vous pouvez :");
    System.out.println("1- Changer de piece");
    //selectionne changer de piece
    System.out.println("Aller dans la piece :");
    
}
}