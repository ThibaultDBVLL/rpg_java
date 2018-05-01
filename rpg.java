import java.util.*;
class rpg{
    public static void main(String[] args) {
        String jouer;
        //String oui = "oui";
        //String non = "non";
        Scanner rep_user = new Scanner(System.in);

        System.out.println("Tu veux jouer à un super rpg ? (Ecris 'Oui' ou 'non')");
        jouer = rep_user.next();
        //System.out.println(jouer);
        rep_user.close();
        
        if (jouer.equals("oui")) {
            System.out.println("trop cool !");
        } else if (jouer.equals("non")){
            System.out.println("Dommage !");
            System.exit(0);
        } else {
            
                System.out.println("Je n'ai pas compris, tape oui pour jouer, ou non pour partir");
                // TODO : replace next line with something that go back to line 14 (beginning of if / else)
                System.exit(0);
        };

        public class character{
            public int health = 100;
            public int strength = 10;
        }


    




    
    }

}