import java.util.*;
class rpg{
    public static void main(String[] args) {
        String jouer;
        //String oui = "oui";
        //String non = "non";
        Scanner rep_user = new Scanner(System.in);

        System.out.println("Tu veux jouer à un super rpg ? (Ecris 'Oui' ou 'non')");
        jouer = rep_user.next();
        System.out.println(jouer);
        rep_user.close();
        
        if (jouer.equals("oui")) {
            System.out.println("trop cool !");
        } 
        
    }
}