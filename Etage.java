import java.util.*;

abstract class Etage{
    private LinkedList<Piece> list_piece;
     Etage (){
        list_piece = new linkedList<Piece>(); 
    }
 
    public Piece getPiece(int i) {
        return list_piece.get(i);
    }

    public LinkedList<Piece> getAllPiece(){
        return list_piece;
    }

    public String toString(){
        String tmp ="";

        for(int i=0 ; i<list_piece.size();i++){
            
        }

        return 
    }


}