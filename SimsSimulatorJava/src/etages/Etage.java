package etages;

import java.util.LinkedList;

import pieces.Piece;

public abstract class Etage{
    private String nom;
    private LinkedList<Piece> list_piece;
    
    public Etage (LinkedList<Piece> list_piece, String nom){
        this.nom = nom;
       this.list_piece = list_piece; 
    }
    public String getNom(){
        return this.nom;
    }

    public Piece getPiece(int i) {
        return list_piece.get(i);
    }

    public LinkedList<Piece> getAllPiece(){
        return list_piece;
    }

    public String toString(){
        String tmp ="Piece : ";

        for(int i=0 ; i<list_piece.size()-1;i++){
            tmp = tmp + list_piece.get(i) + ", " ;
        }
        return tmp + list_piece.get(list_piece.size()-1);
    }


}