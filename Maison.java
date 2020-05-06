import java.util.LinkedList;

public class Maison {

    private LinkedList<Etage> liste_etages = new LinkedList<Etage>();
    private Etage memory_etage;
    private Piece memory_piece;
    //Liste_etages.add(sous_sol);
    //Liste_etages.add(rez_de_chaussee);
    //Liste_etages.add(premier_etage);
    //Liste_etages.add(toit);

    public Maison(LinkedList<Etage> liste_etages) {
        this.liste_etages = liste_etages;
        
    }

    public void setEtage(Etage etage_actuel){
        //verifier si l'etage est bien présent dans la maison
        memory_etage = etage_actuel;
    }

    public void setPiece(Piece piece_actuel){
        //verifier si l'etage est bien présent dans la maison
        memory_piece = piece_actuel;
    }

    public Piece getPiece(){
        return memory_piece;
    }

    public Etage getEtage(){
        return memory_etage;
    }
}
