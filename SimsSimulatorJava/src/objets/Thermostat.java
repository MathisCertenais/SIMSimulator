package objets;

public class Thermostat extends Objet {
    
    public Thermostat(){
       super("Thermostat", "Allumé");
       actions.add("Allumer le thermostat");    //Ajout des Actions de Bases du thermostat
       actions.add("Eteindre le thermostat");
       actions.add("Regler la température");    
    }

    public void realiserAction(int c) {
      if(c == 0){
          if(this.etat == "allumé"){
              System.out.println("Le thermostat est déjà allumé");
          }
          else {
              this.etat = "allumé";
              System.out.println("Le thermostat est allumé");
          }
      }
      else if(c == 1){
          if(this.etat == "eteint"){
              System.out.println("Le thermostat est déjà éteint");
          }
          else {
              this.etat = "eteint";
              System.out.println("Le thermostat est éteint");
          }
      }
      else if(c == 2){
         if(this.etat == "reglage"){
             System.out.println("Le thermostat est déjà en mode reglage de température");
         }
         else {
             this.etat = "reglage";
             System.out.println("Le thermostat est en mode reglage de température");
         }
     }
      else {
          System.out.println("Il ne se passe rien"); 
      }
      
  }
   }