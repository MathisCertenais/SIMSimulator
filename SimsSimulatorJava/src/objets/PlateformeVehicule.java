package objets;

import java.util.ArrayList;
import java.util.Scanner;

public class PlateformeVehicule extends Objet {

    ArrayList<String> vehicules = new ArrayList<String>();
    
    public PlateformeVehicule(){
       super("Platforme à vehicule", "operationnel");
       actions.add("Utiliser la plateforme a vehicule");
       vehicules.add("Voiturette de golf");
       vehicules.add("Renault Scenic");
       vehicules.add("Audi TT");
       vehicules.add("Tesla Roadster Edition Space X");
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("Liste des vehicules :");
            for(int i=0; i<vehicules.size(); i++){
                System.out.println(i + "- " + vehicules.get(i));
            }
            System.out.print("Selectionner un vehicule : ");
            int idVehicule = scan.nextInt();
            System.out.println("L'ascenseur s'active et vous pouvez admirer votre magnifique " 
                + vehicules.get(idVehicule));
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
}