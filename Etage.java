import java.util.*;

abstract class Etage{
    private LinkedList<Piece> list_piece;
    
    public Etage (LinkedList<Piece> list_piece){
       this.list_piece = list_piece; 
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
            tmp = tmp + list_piece.get(i);
        }
        return tmp;
    }


}