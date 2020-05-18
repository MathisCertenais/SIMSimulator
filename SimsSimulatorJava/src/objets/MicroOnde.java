package objets;


public class MicroOnde extends Objet {
    
    public MicroOnde(){
       super("Micro-Onde","eteint");
       actions.add("allumer le micro-onde");    //Ajout des Actions de Bases de le micro-onde
       actions.add("eteindre le micro_onde");  
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "allume") {
                System.out.println("Le micro-Onde est déja Allumé");
            } else {
                this.etat = "allume";
                System.out.println("Vous allumez Le micro-Onde");
            }
        } else if (c == 0) {
            if (this.etat == "eteint") {
                System.out.println("Le micro-Onde est déja eteint");
            } else {
                this.etat = "eteint";
                System.out.println("vous eteignez Le micro-Onde");
            }
        }   else {
            System.out.println("Il ne se passe rien");
        }
    }
}