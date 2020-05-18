package old_sprint_0;
import java.util.LinkedList;
import java.util.Scanner;

public class launcher {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Maison maison = Initialisation.initialiser();
    System.out.println("Bienvenue dans notre Maison");
    Boolean play = true;
    while(play){
        System.out.println("Vous êtes actuellement dans la pièce " + maison.getPiece().getNom() 
            + " à l'étage " + maison.getEtage().getNom());
        System.out.println("Vous pouvez :");
        System.out.println("1- Changer de piece");
        int idAction = scan.nextInt();
        if(idAction == 0){
         play = false;
        }
        System.out.println("Aller dans la piece :");
        LinkedList<Piece> pieces_possibles = maison.getPiece().getpiece_Ajacent();
        for (int i=0; i<pieces_possibles.size(); i++) {
            System.out.println(i + "- " + pieces_possibles.get(i).getNom());      
        }
        int idPiece = scan.nextInt();
        maison.setPiece(pieces_possibles.get(idPiece));
    }
    scan.close();
}
}