import java.util.*;
class rpg{
    public static void main(String[] args) {
        String jouer;
        //String oui = "oui";
        //String non = "non";
        //Boolean wePlay = false;
        Scanner rep_user = new Scanner(System.in);

        System.out.println("Tu veux jouer à un super rpg ? (Ecris 'Oui' ou 'non')");
        jouer = rep_user.nextLine();
        System.out.println(jouer);
        rep_user.close();
        //wePlay = rep_user.equals(oui);
        
        if (jouer == "oui") {
            System.out.println("trop cool !");
        }
        
    }
}