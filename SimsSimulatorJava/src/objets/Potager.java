package objets;


public class Potager extends Objet {
    
    public Potager(){
       super("Potager", "disponible");
       actions.add("Rentrer dans le potager");    //Ajout des Actions de Bases du potager
       actions.add("Sortir du potager");
       actions.add("prendre des légumes");
       actions.add("planter des graines");
       
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "occupe"){
                System.out.println("Vous êtes déja dans le potager");
            }
            else {
                this.etat = "occupe";
                System.out.println("Vous rentrez dans le potager");
            }
        }
        else if(c == 1){
            if(this.etat == "disponible"){
                System.out.println("Vous n'êtes pas dans le potager");
            }
            else {
                this.etat = "disponible";
                System.out.println("Vous sortez du potager");
            }
        }else if(c == 2){
            if(this.etat == "disponible"){
                System.out.println("Il faut être dans le potager pour pouvoir prendre des légumes");
            }
            else {
                System.out.println("*Vous prenez des legumes*");
            }
        }else if(c == 3){
            if(this.etat == "disponible"){
                System.out.println("Il faut être dans le potager pour pouvoir planter des graines");
            }
            else {
                System.out.println("*Vous plantez des graines*");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
}