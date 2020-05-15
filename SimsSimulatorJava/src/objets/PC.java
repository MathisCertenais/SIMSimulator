package objets;


public class PC extends Objet {
    
    public PC(){
       super("PC", "éteint");
       actions.add("Allumer le PC");    //Ajout des Actions de Bases de le PC
       actions.add("Eteindre le PC");
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "allumé"){
                System.out.println("Le PC est déjà allumé");
            }
            else {
                this.etat = "allumé";
                System.out.println("Le PC s'allume");
            }
        }
        else if(c == 1){
            if(this.etat == "éteint"){
                System.out.println("Le PC est déjà éteint");
            }
            else {
                this.etat = "éteint";
                System.out.println("Le PC s'éteint");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
}