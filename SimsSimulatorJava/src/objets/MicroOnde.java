package objets;


public class MicroOnde extends Objet {
    
    public MicroOnde(){
       super("Micro-Onde","eteint");
       actions.add("allumer le micro-onde");    //Ajout des Actions de Bases de le micro-onde
       actions.add("eteindre le micro_onde");  
    }
}