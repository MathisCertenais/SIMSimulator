package objets;


public class PompeAChaleur extends Objet {
    
    public PompeAChaleur(){
       super("Pompe à Chaleur", "éteinte");
       actions.add("Allumer la pompe a chaleur");    //Ajout des Actions de Bases de la pompe a chaleur
       actions.add("Eteindre la pompe a chaleur");
       
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "allumée"){
                System.out.println("La pompe est déjà allumée");
            }
            else {
                this.etat = "allumée";
                System.out.println("La pompe s'allume");
            }
        }
        else if(c == 1){
            if(this.etat == "éteinte"){
                System.out.println("La pompe est déjà éteinte");
            }
            else {
                this.etat = "éteinte";
                System.out.println("La pompe s'éteint");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
}