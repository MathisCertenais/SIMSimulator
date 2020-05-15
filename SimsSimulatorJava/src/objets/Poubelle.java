package objets;


public class Poubelle extends Objet {
    
    public Poubelle(){
       super("Poubelle", "fermée");
       actions.add("Ouvrir la poubelle");    //Ajout des Actions de Bases de la poubelle
       actions.add("Fermer la poubelle");
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "ouverte"){
                System.out.println("La poubelle est déjà ouverte");
            }
            else {
                this.etat = "ouverte";
                System.out.println("Vous ouvrez la poubelle, ça sent le bigmac froid");
            }
        }
        else if(c == 1){
            if(this.etat == "fermée"){
                System.out.println("La poubelle est déjà fermée");
            }
            else {
                this.etat = "fermée";
                System.out.println("Vous fermez la poubelle");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
}