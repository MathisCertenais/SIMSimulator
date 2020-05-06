import java.util.LinkedList;

public class Maison {

    private LinkedList Liste_etages = new LinkedList<Etage>();
    Liste_etages.add(Etage sous_sol);
    Liste_etages.add(Etage rez_de_chaussee);
    Liste_etages.add(Etage premier_etage);
    Liste_etages.add(Etage toit);
    public Maison(LinkedList Liste_etages) {
        this.Liste_etages = Liste_etages;

    }


}