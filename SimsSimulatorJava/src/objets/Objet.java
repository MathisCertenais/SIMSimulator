package objets;


import java.util.List;
import java.util.LinkedList;

public abstract class Objet{
    //attributs
    private String nom;
    private String etat;
    private LinkedList<String> actions = new LinkedList<String>();

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
    public LinkedList<String> getAction(){
        return this.actions;
    }

    public String realiserAction(int c){
        return "Il ne se passe rien";
    }
}