package old_sprint_0;

import java.util.List;
import java.util.LinkedList;

public abstract class Objet {
    // attributs
    private String nom;
    private String etat;
    private List<String> actions = new LinkedList<String>();

    public Objet(String nom, String etat, LinkedList<String> actions) {
        this.setNom(nom);
        this.setEtat(etat);
        this.setActions(actions);
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}