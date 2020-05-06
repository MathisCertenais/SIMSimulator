import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Piece {
    // Attributs de la Pièce
    LinkedList<Piece> piece_Ajacente;
    ArrayList<Objet> list_objets;  

    public Piece(LinkedList<Piece> piece_Ajacent,ArrayList<Objet> list_objet) {
        this.piece_Ajacente =  piece_Ajacent;
        this.list_objets =  list_objet;
    }
    public LinkedList<Piece> Getpiece_Ajacent(){
        return  this.piece_Ajacente;
    }
    public ArrayList<Objet> Getlist_objet(){
        return  this.list_objets;
    }
}