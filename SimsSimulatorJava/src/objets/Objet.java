package objets;


import java.util.List;
import java.util.LinkedList;

public abstract class Objet{
    //attributs
    private String nom;
    private String etat;
    private List<String> actions = new LinkedList<String>();

    public Objet(String nom, String etat, LinkedList<String> actions){
        this.nom = nom;
        this.etat = etat;
        this.actions = actions;
    }

    public String getNom(){
        return this.nom;
    }
    public String getEtat(){
        return this.etat;
    }
    public List<String> getAction(){
        return this.actions;
    }
}