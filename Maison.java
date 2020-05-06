import java.util.LinkedList;

public class Maison {

    private LinkedList<Etage> liste_etages = new LinkedList<Etage>();
    //Liste_etages.add(sous_sol);
    //Liste_etages.add(rez_de_chaussee);
    //Liste_etages.add(premier_etage);
    //Liste_etages.add(toit);
    public Maison(LinkedList<Etage> liste_etages) {
        this.liste_etages = liste_etages;

    }


}