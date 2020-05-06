import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class launcher {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Maison maison = Initialisation.initialiser();
    System.out.println("Bienvenue dans notre Maison");
    while(true){
        System.out.println("Vous êtes actuellement dans la pièce " + maison.getPiece().getNom() 
            + " à l'étage " + maison.getEtage().getNom());
        System.out.println("Vous pouvez :");
        System.out.println("1- Changer de piece");
        int idAction = scan.nextInt();
        System.out.println("Aller dans la piece :");
        LinkedList<Piece> pieces_possibles = maison.getPiece().getpiece_Ajacent();
        for (Piece p : pieces_possibles) {
            System.out.println(p.getNom());      
        }
        int idPiece = scan.nextInt() + 1;
        maison.setPiece(pieces_possibles.get(idPiece));
    }
}
}