package objets;

public class SecheLinge extends Objet {
    
    public SecheLinge(){
        super("Seche linge","Eteint");
       actions.add("utiliser le seche linge");    //Ajout des Actions de Bases de le seche linge
     }

     public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "allumée"){
                System.out.println("Le seche linge est déjà utilisé");
            }
            else {
                this.etat = "allumée";
                System.out.println("Le seche linge s'allume");
            }
        }
        else if(c == 1){
            if(this.etat == "éteinte"){
                System.out.println("Le seche linge est déjà éteint");
            }
            else {
                this.etat = "éteinte";
                System.out.println("Le seche linge s'éteint");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
 }
