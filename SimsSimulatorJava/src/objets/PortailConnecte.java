package objets;


public class PortailConnecte extends Objet {
    
    public PortailConnecte(){
       super("Portail", "fermé");
       actions.add("Ouvrir le portail connecter");    //Ajout des Actions de Bases de le portail connecter
       actions.add("Fermer le portail connecter");
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "ouvert"){
                System.out.println("Le portail est déjà ouvert");
            }
            else {
                this.etat = "ouvert";
                System.out.println("Le portail s'ouvre");
            }
        }
        else if(c == 1){
            if(this.etat == "fermé"){
                System.out.println("Le portail est déjà fermé");
            }
            else {
                this.etat = "fermé";
                System.out.println("Le portail se ferme");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
}