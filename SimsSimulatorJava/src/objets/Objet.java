package objets;


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

    public void realiserAction(int c){
    }

    public String toString(){
        return(this.nom + " est " + this.etat);
    }

    public void actualiser(boolean jour){
    }
}