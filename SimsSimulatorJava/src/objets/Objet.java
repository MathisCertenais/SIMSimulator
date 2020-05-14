package objets;


import java.util.List;
import java.util.LinkedList;

public abstract class Objet{
    //attributs
    protected String nom;
    protected String etat;
    protected LinkedList<String> actions;

    public Objet(String nom, String etat){
        this.nom = nom;
        this.etat = etat;
        this.actions = new LinkedList<String>();
    }

    public String getNom(){
        return this.nom;
    }
    public String getEtat(){
        return this.etat;
    }
    public LinkedList<String> getAction(){
        return this.actions;
    }

    public String realiserAction(int c){
        return "Il ne se passe rien";
    }
}