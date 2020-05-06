import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Piece {
    // Attributs de la Pièce
    LinkedList<Piece> Piece_Ajacente;
    ArrayList<Objet> list_objets;  

    public Piece(LinkedList<Piece> Piece_Ajacent,ArrayList<Objet> list_objet) {
        this.Piece_Ajacente =  Piece_Ajacent;
        this.list_objets =  list_objet;
    }
}