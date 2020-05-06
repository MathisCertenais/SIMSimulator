import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Piece {
    LinkedList<Piece> Piece_Ajacente;
    ArrayList<Objet> list_objets;  

    public Piece() {
        this.Piece_Ajacente = new LinkedList<Piece>();
        this.list_objets = new ArrayList<Objet>();
        remplir_Piece();
    }

    private void remplir_Piece(){};
}