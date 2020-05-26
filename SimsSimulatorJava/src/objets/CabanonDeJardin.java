package objets;

import java.util.ArrayList;
import java.util.LinkedList;

import maison.Maison;
import pieces.Jardin;
import pieces.Piece;
import pieces.PieceSecrete;

public class CabanonDeJardin extends Objet {
    
    public CabanonDeJardin(){
       super("Cabanon De Jardin", "disponible");
       actions.add("Rentrer dans le Cabanon de Jardin");    //Ajout des Actions de Bases du Cabanon de Jardin
       actions.add("Sortir du Cabanon de Jardin");
       actions.add("Prendre des outils");
       actions.add("Deposer des outils");
       
    }

    
    public void realiserAction(int c,boolean admin,Maison maison) {
        if(c == 0){
            if(this.etat == "occupe" || this.etat == "Occupe"){         //Occupe correspond a quand on a pris des outils
                System.out.println("Vous êtes déja dans le Cabanon de Jardin");
            }
            else {
                this.etat = "occupe";
                System.out.println("Vous rentrez dans le Cabanon de Jardin");
            }
        }
        else if(c == 1){
            if(this.etat == "disponible"){
                System.out.println("Vous n'êtes pas dans le Cabanon de Jardin");
            }
            else {
                this.etat = "disponible";
                System.out.println("Vous sortez du Cabanon de Jardin");
            }
        }else if(c == 2){
            if(this.etat == "disponible"){
                System.out.println("Il faut être dans le Cabanon de Jardin pour pouvoir prendre des outils");
            } else if(this.etat == "outils"){
                System.out.println("Vous avez déja pris des outils, veuillez d'abord deposer les précédents");
            }
            else {
                this.etat = "Occupe";
                System.out.println("*Vous prenez des outils*");
            }
        }else if(c == 3){
            if(this.etat == "occupe"){
                System.out.println("Vous n'avez pas d'outils à deposer, veuillez d'abord prendres des outils");
            }else if(this.etat == "disponible"){
                System.out.println("Vous devez être dans le cabanon pour prendre des outils");
            }
            else {
                this.etat = "occupe";
                System.out.println("*Vous deposez des outils*");
            }
        }else if(admin && c == 4){
           Piece piecesecrete =  creationPièceSecrete(maison);
            maison.getEtage().getAllPiece().add(piecesecrete);
            maison.setPiece(piecesecrete);
            System.out.println("pièce changé");
        }else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
  private Piece creationPièceSecrete(Maison maison){
    LinkedList<Piece> piece_Adjacent_PieceSecrete = new LinkedList<Piece>();
    for (Piece piece : maison.getEtage().getAllPiece()) {
        if(piece instanceof Jardin){
            piece_Adjacent_PieceSecrete.add(piece);
        }
    }
    ArrayList<Objet> objets_PieceSecrete = new ArrayList<Objet>();
    for (Objet objet : maison.getPiece().getlist_objet()) {
        if(objet instanceof CameraSurveillance){
            objets_PieceSecrete.add(objet);
        }else if(objet instanceof CameraSurveillance){
            objets_PieceSecrete.add(objet);
        }else if(objet instanceof Chaise){
            objets_PieceSecrete.add(objet);
        }else if(objet instanceof CapteurTemperature){
            objets_PieceSecrete.add(objet);
        }else if(objet instanceof CapteurHumidite){
            objets_PieceSecrete.add(objet);
        }else if(objet instanceof Poubelle){
            objets_PieceSecrete.add(objet);
        }

    }
    return new PieceSecrete("Bunker",piece_Adjacent_PieceSecrete,objets_PieceSecrete);
  }   
// pièce secrete  



}