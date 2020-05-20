package objets;

public class StoreConnecte extends Objet {
    
    public StoreConnecte(){
        super("Store connecté","Ouvert");
        actions.add("Ouvrir le store connecté");    //Ajout des Actions de Bases de le store connecte
        actions.add("Fermer le store connecté");

    }

    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "ouvert"){
                System.out.println("Le store connecté est déjà ouvert");
            }
            else {
                this.etat = "ouvert";
                System.out.println("Le store connecté s'ouvre");
            }
        }
        else if(c == 1){
            if(this.etat == "fermé"){
                System.out.println("Le store connecté est déjà fermé");
            }
            else {
                this.etat = "fermé";
                System.out.println("Le store connecté se ferme");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }

    @Override
    public void actualiser(boolean jour){
        if(jour){
            this.etat ="ouvert";
        }else{
            this.etat ="fermé";
        }
    }
}