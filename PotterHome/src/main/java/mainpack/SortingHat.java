package mainpack;
import mainpack.character.House;
import java.util.Scanner;

public class SortingHat {
    private static final Scanner scan = new Scanner(System.in);
    static House gryffindor = new House("Gryffindor", 10, 10, 20, 10);
    static House hufflepuff = new House("Hufflepuff", 20, 10, 10, 10);
    static House ravenclaw = new House("Ravenclaw", 10, 10, 10, 20);
    static House slytherin = new House("Slytherin", 10, 20, 10, 10);
    public static House Sort() {
        while (true) {
            System.out.println("In witch House do you belong?");
            System.out.println("1. Gryffindor");
            System.out.println("2. Hufflepuff");
            System.out.println("3. Ravenclaw");
            System.out.println("4. Slytherin");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    return gryffindor;
                }
                case 2 -> {
                    return hufflepuff;
                }
                case 3 -> {
                    return ravenclaw;
                }
                case 4 -> {
                    return slytherin;
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
